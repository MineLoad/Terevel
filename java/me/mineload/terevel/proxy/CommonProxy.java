package me.mineload.terevel.proxy;

import me.mineload.terevel.init.TerevelBlocks;
import me.mineload.terevel.init.TerevelItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) 
	{
		TerevelItems.init();
		TerevelBlocks.init();

		MinecraftForge.EVENT_BUS.register(TerevelBlocks.class);
		MinecraftForge.EVENT_BUS.register(TerevelItems.class);
	}

	public void init(FMLInitializationEvent event) 
	{
		
	}

	public void postinit(FMLPostInitializationEvent event) {
	}
}
