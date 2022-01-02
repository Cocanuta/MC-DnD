package com.snatchybuckles.sbdnd.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab SBDND_TAB = new CreativeModeTab("sbdndTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(null);
        }
    };
    
}
