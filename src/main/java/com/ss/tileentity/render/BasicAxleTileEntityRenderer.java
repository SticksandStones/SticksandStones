package com.ss.tileentity.render;

import com.ss.blocks.render.BasicAxleModel;
import com.ss.reference.Resources;
import com.ss.tileentity.BasicAxleTileEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class BasicAxleTileEntityRenderer extends TileEntitySpecialRenderer
{
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        if (tileEntity instanceof BasicAxleTileEntity)
        {
            BasicAxleTileEntity basicAxle = (BasicAxleTileEntity) tileEntity;
            GL11.glPushMatrix();
            GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            bindTexture(Resources.Models.basicAxle);
            BasicAxleModel.instance().render(0.0625F);
            GL11.glPopMatrix();
        }
    }
}
