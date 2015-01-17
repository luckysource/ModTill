package com.lucky.ModTill;

import com.lucky.ModTill.handler.ConfigurationHandler;
import com.lucky.ModTill.proxy.IProxy;
import com.lucky.ModTill.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ModTill {
	
	@Mod.Instance(Reference.MOD_ID)
	public static ModTill instance;
	 
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//network handling
		//mod config - user can tweak settings
		//item and block initialize
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void preInit(FMLInitializationEvent event){
		//register GUI, tile entities, crafting recipes
	}
	
	@Mod.EventHandler
	public void preInit(FMLPostInitializationEvent event){
		//wrap anything up after other mods have initialized
	}
}
