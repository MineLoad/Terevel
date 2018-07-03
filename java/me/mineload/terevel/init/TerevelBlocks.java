package me.mineload.terevel.init;

import me.mineload.terevel.init.blocks.*;
import me.mineload.terevel.main.Instances;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TerevelBlocks 
{

	public static final TerevelMainBlock trv_main = new TerevelMainBlock(Material.IRON, SoundType.METAL, "pickaxe", 2, 25F, 0, 0F, 2F);
	public static final StonePath stonepath = new StonePath(Material.ROCK, SoundType.STONE, "pickaxe", 0, 10F, 1, 0F, 1.5F);
	public static final DarkStonePath darkstonepath = new DarkStonePath(Material.ROCK, SoundType.STONE, "pickaxe", 1, 50F, 0, 0F, 2.5F);
	public static final GlowStonePath glowstonepath = new GlowStonePath(Material.ROCK, SoundType.STONE, "pickaxe", 1, 50F, 0, 1F, 2.5F);
	
	public static void init()
	{
		setName(trv_main, "trv_main");
		setName(stonepath, "stonepath");
		setName(darkstonepath, "darkstonepath");
		setName(glowstonepath, "glowstonepath");
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		
		registry.register(trv_main);
		registry.register(stonepath);
		registry.register(darkstonepath);
		registry.register(glowstonepath);
	}

	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();

		registry.register(new ItemBlock(trv_main).setRegistryName(trv_main.getRegistryName()));
		registry.register(new ItemBlock(stonepath).setRegistryName(stonepath.getRegistryName()));
		registry.register(new ItemBlock(darkstonepath).setRegistryName(darkstonepath.getRegistryName()));
		registry.register(new ItemBlock(glowstonepath).setRegistryName(glowstonepath.getRegistryName()));
	}

	public static void setName(Block block, String name) {
		block.setRegistryName(new ResourceLocation(Instances.MODID, name));
		block.setUnlocalizedName(name);
	}
}
