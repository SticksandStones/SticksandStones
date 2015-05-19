package com.SticksandStones.SandS;


import com.SticksandStones.SandS.lib.Reference;
import com.SticksandStones.SandS.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class SticksandStones {

	@Mod.Instance("LL")
	public static SticksandStones instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	@Mod.EventHandler
	public void Preinit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void Postinit(FMLPostInitializationEvent event){
		
	}
}
