package com.calibermc.caliberblocks.util;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {


    public static class Blocks {

        private static final Tag<Block> VALUABLE_BLOCKS =  createTag("valuable_blocks");

        private static Tag<Block> createTag(String name) {
            return TagRegistry.block(new Identifier(CaliberBlocks.MOD_ID, name));
        }

    }


    public static class Items {

        public static final Tag<Item> DRAGON_GLASS = createTag("gems/dragon_glass");

        private static Tag<Item> createTag(String name) {
            return TagRegistry.item(new Identifier(CaliberBlocks.MOD_ID));
        }

        private static Tag<Item> createCommonTag(String name) {
            return TagRegistry.item(new Identifier("c", name));
        }





    }
}
