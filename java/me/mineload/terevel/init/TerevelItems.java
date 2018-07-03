package me.mineload.terevel.init;

import me.mineload.terevel.init.items.*;
import me.mineload.terevel.main.Instances;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TerevelItems 
{
	public static final Test test = new Test();
	public static final StoneShard stoneshard = new StoneShard();
	public static final IceShard iceshard = new IceShard();
	public static final BucketIce bucketice = new BucketIce();
	public static final StoneHammer stonehammer = new StoneHammer();
	
	public static void init()
	{
		setName(test, "test");
		setName(stoneshard, "stoneshard");
		setName(iceshard, "iceshard");
		setName(bucketice, "bucketice");
		setName(stonehammer, "stonehammer");
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(test);
		registry.register(stoneshard);
		registry.register(iceshard);
		registry.register(bucketice);
		registry.register(stonehammer);
	}
	
	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(Instances.MODID, name));
		item.setUnlocalizedName(name);
	}
}
