package com.calibermc.caliberblocks.mixin;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class CaliberMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		CaliberBlocks.LOGGER.info("Caliber Blocks successfully loaded!");
	}
}
