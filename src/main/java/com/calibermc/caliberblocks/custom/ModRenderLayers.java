package com.calibermc.caliberblocks.custom;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.registry.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

/** Sets Render Layers for various blocks **/
public class ModRenderLayers {
    public static void Layers() {
        CaliberBlocks.LOGGER.info("Setting Rendering Layers...");
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARREL_HORIZONTAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARREL_VERTICAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARREL_EMPTY, RenderLayer.getCutout());
    }
}
