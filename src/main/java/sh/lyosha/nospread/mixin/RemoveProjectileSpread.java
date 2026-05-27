package sh.lyosha.nospread.mixin;

import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Projectile.class)
public abstract class RemoveProjectileSpread {

    @Inject(method = "getMovementToShoot", at = @At("HEAD"), cancellable = true)
    private void removeSpread(double x, double y, double z, float speed, float divergence, CallbackInfoReturnable<Vec3> cir) {
        cir.setReturnValue(new Vec3(x, y, z).normalize().scale(speed));
    }
}
