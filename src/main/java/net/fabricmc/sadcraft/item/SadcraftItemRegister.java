package net.fabricmc.sadcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.sadcraft.SadcraftMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SadcraftItemRegister {

    private static Item registerItems(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(SadcraftMod.MOD_ID,name),item);
    }
    public static void registerModItems(){
        SadcraftMod.LOGGER.debug("Register Mod Items for " + SadcraftMod.MOD_ID);
    }

    public static final Item RUBY = registerItems("ruby",new SadcraftRuby(new FabricItemSettings().group(SadcraftItemGroup.SadcraftIdentifier())));


}
