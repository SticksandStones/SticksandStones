package com.ss.proxy;


import com.ss.init.ModBlocks;
import com.ss.items.render.BasicAxleItemRenderer;
import com.ss.tileentity.BasicAxleTileEntity;
import com.ss.tileentity.render.BasicAxleTileEntityRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers()
	{
		RENDER_ID = RenderingRegistry.getNextAvailableRenderId();

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.basicAxle), new BasicAxleItemRenderer());

		ClientRegistry.bindTileEntitySpecialRenderer(BasicAxleTileEntity.class, new BasicAxleTileEntityRenderer());
	}
}