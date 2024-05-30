package com.InceptionWork.inception.block;

import com.InceptionWork.inception.registry.RegistryHandler;
import com.InceptionWork.inception.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {
    public BlockBase(Material materialIn, String registryName, CreativeTabs creativeTab) {
        super(materialIn);
        setRegistryName(Reference.MODID, registryName);
        setUnlocalizedName(Reference.MODID + "." + registryName);
        setCreativeTab(creativeTab);
        RegistryHandler.BLOCKS.add(this);
        RegistryHandler.ITEMS.add(new ItemBlock(this).setRegistryName(Reference.MODID, registryName));
    }
}
