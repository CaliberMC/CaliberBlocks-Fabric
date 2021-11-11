package com.calibermc.caliberblocks;

import com.calibermc.caliberblocks.registry.ModBlocks;
import com.calibermc.caliberblocks.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CaliberBlocks implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "caliberblocks";
    public static final Logger LOGGER = LogManager.getLogger("Caliber Blocks");

    // Inventory Menu Page - Group Inventory Stacks
    public static final ItemGroup CALIBER_BLOCKS_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "caliber_blocks"))
            .icon(() -> new ItemStack(Blocks.ANDESITE_STAIRS))
            .appendItems(stacks -> {
                // Change order of blocks displayed in inventory or add blocks not from this mod
                stacks.add(new ItemStack(ModBlocks.DRAGON_GLASS_BLOCK));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_SMOOTH));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_ORNATE));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_CARVED));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_CRACKED));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_WEATHERED));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_DIRTY));
                stacks.add(new ItemStack(ModBlocks.RED_KEEP_BLOCK_MUDDY));
            })
            .build();


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModItems.registerItems();
        ModBlocks.registerBlocks();
        LOGGER.info("Loading Caliber Blocks...");



    }
}