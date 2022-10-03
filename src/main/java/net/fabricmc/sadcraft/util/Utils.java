package net.fabricmc.sadcraft.util;

import net.fabricmc.sadcraft.SadcraftMod;
import net.minecraft.util.Identifier;

public class Utils {

    public static Identifier ID(String id){
        return new Identifier(SadcraftMod.MOD_ID,id);
    }
}
