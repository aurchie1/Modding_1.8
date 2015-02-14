package com.colbeazy.PistonTools;

import com.colbeazy.PistonTools.Proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid=PistonToolsModVars.modid, name=PistonToolsModVars.name, version=PistonToolsModVars.version)

public class PistonToolsMod {
	
	@Instance(PistonToolsModVars.modid)
	public static PistonToolsMod instance;
	
	@SidedProxy(clientSide = "PistonToolsMod.proxies.ClientProxy", serverSide = "PistonToolsMod.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	
	}
	
	
}
