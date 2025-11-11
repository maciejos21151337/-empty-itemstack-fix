package com.example.emptyitemstackfix.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    
    @Inject(method = "isEmpty", at = @At("HEAD"), cancellable = true)
    private void fixEmptyCheck(CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = (ItemStack) (Object) this;
        if (stack.getCount() <= 0) {
            cir.setReturnValue(true);
        }
    }
}
