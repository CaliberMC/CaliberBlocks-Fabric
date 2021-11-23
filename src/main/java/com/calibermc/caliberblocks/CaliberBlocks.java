package com.calibermc.caliberblocks;

import com.calibermc.caliberblocks.custom.ModRenderLayers;
import com.calibermc.caliberblocks.registry.ModBlocks;
import com.calibermc.caliberblocks.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CaliberBlocks implements ModInitializer {
    // Set MOD_ID
    public static final String MOD_ID = "caliberblocks";
    // This logger is used to write text to the console and the log file.
    public static final Logger LOGGER = LogManager.getLogger("Caliber Blocks");




    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModRenderLayers.Layers();

        LOGGER.info("Loading Caliber Blocks...");



    }
}