package com.ss.init;

import com.ss.items.SSBasicItem;
import com.ss.items.SSSeeds;
import com.ss.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public final class ModItems {

	public static final Item kenaf_fibre = new SSBasicItem().setUnlocalizedName(Names.Items.kenaf_fibre);
	public static final Item raw_kenaf_fibre = new SSBasicItem().setUnlocalizedName(Names.Items.raw_kenaf_fibre);
	public static final Item kenaf_stalk = new SSBasicItem().setUnlocalizedName(Names.Items.kenaf_stalk);
	public static final Item kenaf_fabric = new SSBasicItem().setUnlocalizedName(Names.Items.kenaf_fabric);
	public static final Item kenaf_seeds = new SSSeeds(Blocks.diamond_block, Blocks.farmland).setUnlocalizedName(Names.Items.kenaf_seeds);

	public static void init() {
		GameRegistry.registerItem(kenaf_fibre, Names.Items.kenaf_fibre);
		GameRegistry.registerItem(raw_kenaf_fibre, Names.Items.raw_kenaf_fibre);
		GameRegistry.registerItem(kenaf_stalk, Names.Items.kenaf_stalk);
		GameRegistry.registerItem(kenaf_fabric, Names.Items.kenaf_fabric);
		GameRegistry.registerItem(kenaf_seeds, Names.Items.kenaf_seeds);
	}
}
