package com.ss.items.render;

import com.ss.blocks.render.BasicAxleModel;
import com.ss.reference.Resources;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class BasicAxleItemRenderer extends SSItemRenderer
{
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        switch (type)
        {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case INVENTORY:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        GL11.glPushMatrix();
        bindTexture(Resources.Models.basicAxle);
        switch (type)
        {
            case EQUIPPED:
                GL11.glRotatef(2.0F, 0F, 0.0F, 0.0F);
                GL11.glTranslatef(0F, -0.5F, 0.5F);
            case EQUIPPED_FIRST_PERSON:
                GL11.glTranslatef(0.0F, 0.5F, 0.0F);
                GL11.glRotatef(-4.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(2.0F, 1.0F, 0.0F, 0.0F);
                GL11.glScalef(1F, 1F, 1F);
            case INVENTORY:
                GL11.glTranslatef(0.0F, 1.0F, 0.0F);
                GL11.glRotatef(180f, 0f, 0f, 1f);
                break;
            default:
                break;
        }
        BasicAxleModel.instance().render(0.0625F);
        GL11.glPopMatrix();
    }
}
