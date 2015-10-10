package com.ss.items.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public abstract class SSItemRenderer implements IItemRenderer
{
    public void bindTexture(ResourceLocation resourceLocation)
    {
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceLocation);
    }
}
