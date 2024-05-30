package com.InceptionWork.inception.util;

import com.InceptionWork.inception.registry.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class InceptionTabs extends CreativeTabs {
    private final String LABEL;

    public InceptionTabs(String label) {
        super(Reference.MODID + "." + label);
        LABEL = label;
    }

    @Override
    public ItemStack getTabIconItem() {
        switch (LABEL) {
            default:
                return TabInception.getIcon();
        }
    }
}
