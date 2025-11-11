package com.example.emptyitemstackfix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmptyItemStackFix implements ModInitializer {
    public static final String MOD_ID = "emptyitemstackfix";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Empty ItemStack Fix initialized!");
    }
}
