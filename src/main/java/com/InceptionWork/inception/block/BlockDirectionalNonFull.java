package com.InceptionWork.inception.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDirectionalNonFull extends BlockDirectional {
    public BlockDirectionalNonFull(Material materialIn, String registryName, CreativeTabs creativeTab) {
        super(materialIn, registryName, creativeTab);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
