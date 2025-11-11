package com.example.emptyitemstackfix.mixin;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * If an ItemStack is empty, vanilla throws when encoding it to NBT.
 * Return an empty NbtCompound instead so saving entities/worlds won't crash.
 */
@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method = "toNbt", at = @At("HEAD"), cancellable = true)
    private void onToNbt(CallbackInfoReturnable<NbtCompound> cir) {
        ItemStack self = (ItemStack) (Object) this;
        if (self.isEmpty()) {
            cir.setReturnValue(new NbtCompound());
        }
    }
}
