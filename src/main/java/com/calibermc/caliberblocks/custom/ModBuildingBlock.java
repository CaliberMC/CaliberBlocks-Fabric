package com.calibermc.caliberblocks.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;


/**Custom building blocks**/
public class ModBuildingBlock extends Block {

    public ModBuildingBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .requiresTool()
                .strength(2.0f,30.0f)
                .sounds(BlockSoundGroup.STONE)
                );

    }


}

