package net.fabricmc.sadcraft.item;

import eu.pb4.polymer.api.item.PolymerItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SadcraftItemGroup {

    public static ItemGroup SadcraftIdentifier(){
        ItemStack icon = new ItemStack(Items.COCOA_BEANS);
        Identifier identifier = new Identifier("sadcraft");
        ItemGroup sadcraftgroup = PolymerItemGroup.create(identifier, Text.translatable("itemGroup.sadcraft.SADCRAFT_GROUP")).setIcon(icon);

        return sadcraftgroup;


    }

}
