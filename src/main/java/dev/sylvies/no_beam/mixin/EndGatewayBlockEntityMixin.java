package dev.sylvies.no_beam.mixin;

import net.minecraft.world.level.block.entity.TheEndGatewayBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TheEndGatewayBlockEntity.class)
public class EndGatewayBlockEntityMixin {
    @Inject(method = "getParticleAmount", at = @At("HEAD"), cancellable = true)
    private void disableParticles(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
