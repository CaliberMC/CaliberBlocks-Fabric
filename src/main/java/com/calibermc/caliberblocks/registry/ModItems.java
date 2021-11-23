package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item DRAGON_GLASS = registerItem("dragon_glass",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final BlockItem HORIZONTAL_BARREL = new BlockItem(ModBlocks.HORIZONTAL_BARREL, new Item.Settings().group(ModCreativeTab.TAB_CALIBER_DECORATIONS));
    public static final BlockItem VERTICAL_BARREL = new BlockItem(ModBlocks.VERTICAL_BARREL, new Item.Settings().group(ModCreativeTab.TAB_CALIBER_DECORATIONS));
    public static final BlockItem EMPTY_BARREL = new BlockItem(ModBlocks.EMPTY_BARREL, new Item.Settings().group(ModCreativeTab.TAB_CALIBER_DECORATIONS));

    //

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CaliberBlocks.MOD_ID, name), item);
    }

    // Register items into the game at load
    public static void registerModItems() {
        CaliberBlocks.LOGGER.info("Registering Mod Items for " + CaliberBlocks.MOD_ID);

    }
}
