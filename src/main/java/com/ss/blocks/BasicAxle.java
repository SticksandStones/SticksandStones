package com.ss.blocks;

import com.ss.proxy.CommonProxy;
import com.ss.tileentity.BasicAxleTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BasicAxle extends SSBasicBlock
{
    public BasicAxle()
    {
        super(Material.wood);
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new BasicAxleTileEntity();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return CommonProxy.RENDER_ID;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
}
