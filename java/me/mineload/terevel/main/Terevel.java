package me.mineload.terevel.main;

import static me.mineload.terevel.main.Instances.MODID;
import static me.mineload.terevel.main.Instances.NAME;
import static me.mineload.terevel.main.Instances.VERSION;

import me.mineload.terevel.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class Terevel
{

	@SidedProxy(serverSide = "me.mineload.terevel.proxy.CommonProxy", clientSide = "me.mineload.terevel.proxy.ClientProxy")
	private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preinit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	proxy.postinit(event);
    }
}
