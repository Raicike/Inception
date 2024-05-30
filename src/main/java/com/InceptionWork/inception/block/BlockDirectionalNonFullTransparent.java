package com.InceptionWork.inception.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;

public class BlockDirectionalNonFullTransparent extends BlockDirectionalNonFull {
    public BlockDirectionalNonFullTransparent(Material materialIn, String registryName, CreativeTabs creativeTab) {
        super(materialIn, registryName, creativeTab);
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
