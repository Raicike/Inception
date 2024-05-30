package com.InceptionWork.inception.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;

public class BlockNonFullTransparent extends BlockBase {
    public BlockNonFullTransparent(Material materialIn, String registryName, CreativeTabs creativeTab) {
        super(materialIn, registryName, creativeTab);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
