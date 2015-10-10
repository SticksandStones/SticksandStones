package com.ss.init;

import com.ss.blocks.BasicAxle;
import com.ss.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class ModBlocks
{
	public static final Block basicAxle = new BasicAxle().setBlockName(Names.Blocks.basicAxle);

	public static void init()
	{
		GameRegistry.registerBlock(basicAxle, Names.Blocks.basicAxle);
	}
}