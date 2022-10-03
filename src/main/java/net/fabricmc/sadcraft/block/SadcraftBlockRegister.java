package net.fabricmc.sadcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.sadcraft.SadcraftMod;
import net.fabricmc.sadcraft.util.SadcraftItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SadcraftBlockRegister {

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block);
        return Registry.register(Registry.BLOCK,new Identifier(SadcraftMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(SadcraftMod.MOD_ID, name), new SadcraftRubyBlockItem(block,new FabricItemSettings().group(SadcraftItemGroup.SADCRAFT_GROUP)));
    }

    public static void registerModBlock(){
        SadcraftMod.LOGGER.debug("Register Mod Block for " + SadcraftMod.MOD_ID);
    }
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new SadcraftRubyBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), SadcraftItemGroup.SADCRAFT_GROUP);
}
