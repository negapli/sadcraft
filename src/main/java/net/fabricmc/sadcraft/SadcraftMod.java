package net.fabricmc.sadcraft;

import eu.pb4.polymer.api.resourcepack.PolymerRPUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.sadcraft.block.SadcraftBlockRegister;
import net.fabricmc.sadcraft.item.SadcraftItemRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SadcraftMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "sadcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		if(PolymerRPUtils.addAssetSource("sadcraft") == true){
			LOGGER.info("c'est bon !");
		}else{LOGGER.info("pas bon");}
		SadcraftItemRegister.registerModItems();
		SadcraftBlockRegister.registerModBlock();

		LOGGER.info("Hello Fabric world!");
	}
}
