package me.mineload.terevel.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TerevelModels 
{

	@SubscribeEvent
	public static void register(ModelRegistryEvent event) {
		register(Item.getItemFromBlock(TerevelBlocks.trv_main));
		register(Item.getItemFromBlock(TerevelBlocks.stonepath));
		register(Item.getItemFromBlock(TerevelBlocks.darkstonepath));
		register(Item.getItemFromBlock(TerevelBlocks.glowstonepath));

		register(TerevelItems.test);
		register(TerevelItems.stoneshard);
		register(TerevelItems.iceshard);
		register(TerevelItems.bucketice);
		register(TerevelItems.stonehammer);
	}

	private static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
