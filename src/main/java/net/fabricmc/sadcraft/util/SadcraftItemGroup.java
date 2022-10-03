package net.fabricmc.sadcraft.util;

import eu.pb4.polymer.api.item.PolymerItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class SadcraftItemGroup {

    public static final ItemGroup SADCRAFT_GROUP = PolymerItemGroup.create(Utils.ID("sadcraft"), Text.translatable("itemGroup.sadcraft.SADCRAFT_GROUP"),() -> new ItemStack(Items.COCOA_BEANS));
}
