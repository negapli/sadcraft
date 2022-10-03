package net.fabricmc.sadcraft.block;

import eu.pb4.polymer.api.item.PolymerItem;
import eu.pb4.polymer.api.item.PolymerItemUtils;
import eu.pb4.polymer.api.resourcepack.PolymerModelData;
import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class SadcraftRubyBlockItem extends BlockItem implements PolymerItem {


    public SadcraftRubyBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    public Item getPolymerItem() {return Items.EMERALD_BLOCK;}

    public PolymerModelData modelData = PolymerRPUtils.requestModel(Items.EMERALD_BLOCK,new Identifier("sadcraft","item/ruby_block"));
    @Override
    public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return modelData.value();
    }
    @Override
    public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        return getPolymerItem();
    }
    public ItemStack getPolymerItemStack(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
        ItemStack stack = PolymerItemUtils.createItemStack(itemStack, player);
        return stack;
    }
}
