package com.ss;

import com.ss.init.ModBlocks;
import com.ss.init.ModItems;
import com.ss.init.ModOreDictionary;
import com.ss.init.ModRecipes;
import com.ss.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION_FULL)
public class SticksAndStones {
	@Mod.Instance(Reference.ID)
	public static SticksAndStones instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Config.init(event.getSuggestedConfigurationFile());

		ModBlocks.init();
		ModItems.init();
	}

	@Mod.EventHandler
	public void Init(FMLPostInitializationEvent event) {
		ModRecipes.init();
		ModOreDictionary.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}