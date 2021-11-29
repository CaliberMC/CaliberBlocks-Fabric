package com.calibermc.caliberblocks.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


/**Custom building blocks**/
public class ModWallBlock extends Block {

    public ModWallBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .strength(2.0f,30.0f)
                .sounds(BlockSoundGroup.STONE)
                );

    }


}

