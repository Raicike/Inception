package com.InceptionWork.inception;

import com.InceptionWork.inception.registry.*;
import com.InceptionWork.inception.util.InceptionTabs;
import com.InceptionWork.inception.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class inception {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
    public static final CreativeTabs INCEPTION_TAB = new InceptionTabs("inception_tab");


    private static void init() {
        TabInception.init();
    }
}
