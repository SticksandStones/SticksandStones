package com.ss.blocks.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class BasicAxleModel extends ModelBase
{
    private static BasicAxleModel instance;

    public static BasicAxleModel instance()
    {
        if (instance == null)
            instance = new BasicAxleModel();
        return instance;
    }

    ModelRenderer base;
    ModelRenderer lever;

    public BasicAxleModel()
    {
        textureWidth = 64;
        textureHeight = 32;

        base = new ModelRenderer(this, 0, 0);
        base.addBox(-8F, -2F, -2F, 16, 4, 4);
        base.setRotationPoint(0F, 16F, 0F);
        base.setTextureSize(64, 32);
        base.mirror = true;
        setRotation(base, 0F, 0F, 0F);
        lever = new ModelRenderer(this, 13, 12);
        lever.addBox(-1F, -11F, -1F, 2, 10, 2);
        lever.setRotationPoint(0F, 16F, 0F);
        lever.setTextureSize(64, 32);
        lever.mirror = true;
        setRotation(lever, 0.3926991F, 0F, 0F);
    }

    public void render(float scale)
    {
        base.render(scale);
        lever.render(scale);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
