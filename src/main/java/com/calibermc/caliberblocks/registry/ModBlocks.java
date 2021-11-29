package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.custom.ModBarrelBlock;
import com.calibermc.caliberblocks.custom.ModBuildingBlock;
import com.calibermc.caliberblocks.custom.ModStairsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // ENVIRONMENT BLOCKS
    public static final Block DRAGON_GLASS_BLOCK = registerBlock("dragon_glass_block", new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f,30.0f).sounds(BlockSoundGroup.METAL)));

    // REGION SPECIFIC BLOCKS
    // - Crownlands
    // -- Kings Landing
    // --- Red Keep
    // ---- Blocks
    public static final Block RED_KEEP_BLOCK = registerBlock("red_keep_block", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_SMOOTH = registerBlock("red_keep_block_smooth", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_ORNATE = registerBlock("red_keep_block_ornate", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_CARVED = registerBlock("red_keep_block_carved", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_CRACKED = registerBlock("red_keep_block_cracked", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_WEATHERED = registerBlock ("red_keep_block_weathered", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_DIRTY = registerBlock("red_keep_block_dirty", new ModBuildingBlock());
    public static final Block RED_KEEP_BLOCK_MUDDY = registerBlock("red_keep_block_muddy", new ModBuildingBlock());
    // ---- Slabs
    public static final Block RED_KEEP_SLAB = registerBlock("red_keep_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_SLAB_SMOOTH = registerBlock("red_keep_slab_smooth", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_SLAB_CRACKED = registerBlock("red_keep_slab_cracked", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_SLAB_WEATHERED = registerBlock("red_keep_slab_weathered", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_SLAB_DIRTY = registerBlock("red_keep_slab_dirty", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_SLAB_MUDDY = registerBlock("red_keep_slab_muddy", new SlabBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    // ---- Stairs
    public static final Block RED_KEEP_STAIRS = registerBlock("red_keep_stairs", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_STAIRS_SMOOTH = registerBlock("red_keep_stairs_smooth", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK_SMOOTH.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_STAIRS_CRACKED = registerBlock("red_keep_stairs_cracked", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK_CRACKED.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_STAIRS_WEATHERED = registerBlock("red_keep_stairs_weathered", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK_WEATHERED.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_STAIRS_DIRTY = registerBlock("red_keep_stairs_dirty", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK_DIRTY.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_STAIRS_MUDDY = registerBlock("red_keep_stairs_muddy", new ModStairsBlock(ModBlocks.RED_KEEP_BLOCK_MUDDY.getDefaultState(),FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    // ---- Walls
    public static final Block RED_KEEP_WALL = registerBlock("red_keep_wall", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_WALL_SMOOTH = registerBlock("red_keep_wall_smooth", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_WALL_CRACKED = registerBlock("red_keep_wall_cracked", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_WALL_WEATHERED = registerBlock("red_keep_wall_weathered", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_WALL_DIRTY = registerBlock("red_keep_wall_dirty", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_KEEP_WALL_MUDDY = registerBlock("red_keep_wall_muddy", new WallBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f,30.0f).sounds(BlockSoundGroup.STONE)));

    // - The North
    // -- Winterfell
    public static final Block WINTERFELL_BLOCK = registerBlock("winterfell_block", new ModBuildingBlock());

    // DECORATIVE BLOCKS
    // - Barrels
    public static final Block BARREL_HORIZONTAL = registerBlock("barrel_horizontal", new ModBarrelBlock(),ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final Block BARREL_VERTICAL = registerBlock("barrel_vertical", new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final Block BARREL_EMPTY = registerBlock("barrel_empty", new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS) ;


    /** DO NOT MODIFY BELOW**/
    // Register Blocks to a selected creative tab
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, name), block);
    }
    // Register BlockItems
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    // Register Blocks to Caliber Blocks inventory tab
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(CaliberBlocks.MOD_ID, name), block);
    }
    // Register BlockItems
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModCreativeTab.TAB_CALIBER_BLOCKS)));
    }

    // Register block into the game at load
    public static void registerModBlocks(){
        CaliberBlocks.LOGGER.info("Registering Mod Blocks...");

    }

}
