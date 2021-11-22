package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item DRAGON_GLASS = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //Block Items
    public static final BlockItem DRAGON_GLASS_BLOCK = new BlockItem(ModBlocks.DRAGON_GLASS_BLOCK, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK = new BlockItem(ModBlocks.RED_KEEP_BLOCK, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_SMOOTH = new BlockItem(ModBlocks.RED_KEEP_BLOCK_SMOOTH, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_ORNATE = new BlockItem(ModBlocks.RED_KEEP_BLOCK_ORNATE, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_CARVED = new BlockItem(ModBlocks.RED_KEEP_BLOCK_CARVED, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_CRACKED = new BlockItem(ModBlocks.RED_KEEP_BLOCK_CRACKED, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_WEATHERED = new BlockItem(ModBlocks.RED_KEEP_BLOCK_WEATHERED, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_DIRTY = new BlockItem(ModBlocks.RED_KEEP_BLOCK_DIRTY, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS_GROUP));
    //public static final BlockItem RED_KEEP_BLOCK_MUDDY = new BlockItem(ModBlocks.RED_KEEP_BLOCK_MUDDY, new Item.Settings().group(CaliberBlocks.CALIBER_BLOCKS
    public static final BlockItem HORIZONTAL_BARREL = new BlockItem(ModBlocks.HORIZONTAL_BARREL, new Item.Settings().group(CaliberBlocks.CALIBER_DECORATIONS_GROUP));
    public static final BlockItem VERTICAL_BARREL = new BlockItem(ModBlocks.VERTICAL_BARREL, new Item.Settings().group(CaliberBlocks.CALIBER_DECORATIONS_GROUP));
    public static final BlockItem EMPTY_BARREL = new BlockItem(ModBlocks.EMPTY_BARREL, new Item.Settings().group(CaliberBlocks.CALIBER_DECORATIONS_GROUP));



    // Register items into the game at load
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, "dragon_glass"), DRAGON_GLASS);
        Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, "dragon_glass_block"), DRAGON_GLASS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, "horizontal_barrel"), HORIZONTAL_BARREL);
        Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, "vertical_barrel"), VERTICAL_BARREL);
        Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, "empty_barrel"), EMPTY_BARREL    );

    }
}
