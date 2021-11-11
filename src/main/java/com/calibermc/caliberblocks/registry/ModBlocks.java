package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // ENVIRONMENT BLOCKS
    public static final Block DRAGON_GLASS_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f,30.0f).sounds(BlockSoundGroup.METAL));
    // REGION SPECIFIC BLOCKS
    // -- Red Keep Blocks
    public static final Block RED_KEEP_BLOCK = new Block(FabricBlockSettings.of(Material.STONE) .requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_SMOOTH = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_ORNATE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_CARVED = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_CRACKED = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_WEATHERED = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_DIRTY = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));
    public static final Block RED_KEEP_BLOCK_MUDDY = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE));



    // Register blocks into the game at load
    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "dragon_glass_block"), DRAGON_GLASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block"), RED_KEEP_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_smooth"), RED_KEEP_BLOCK_SMOOTH);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_ornate"), RED_KEEP_BLOCK_ORNATE);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_carved"), RED_KEEP_BLOCK_CARVED);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_cracked"), RED_KEEP_BLOCK_CRACKED);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_weathered"), RED_KEEP_BLOCK_WEATHERED);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_dirty"), RED_KEEP_BLOCK_DIRTY);
        Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, "red_keep_block_muddy"), RED_KEEP_BLOCK_MUDDY);
    }
}
