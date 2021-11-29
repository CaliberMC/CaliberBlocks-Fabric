package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModCreativeTab extends ItemGroup {

    // Creative Mode Tabs
    // - Caliber Blocks Tab
    public static final ItemGroup TAB_CALIBER_BLOCKS = FabricItemGroupBuilder.build(new Identifier(CaliberBlocks.MOD_ID, "caliber_blocks"),
            () -> new ItemStack(ModBlocks.DRAGON_GLASS_BLOCK));

    // - Caliber Decorations Tab
    public static final ItemGroup TAB_CALIBER_DECORATIONS = FabricItemGroupBuilder.build(new Identifier(CaliberBlocks.MOD_ID, "caliber_decorations"),
            () -> new ItemStack(ModBlocks.BARREL_HORIZONTAL));

    public ModCreativeTab(int index, String id) {
        super(index, id);
    }

    @Override
    public ItemStack createIcon() {
        return null;
    }
}
