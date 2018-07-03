package me.mineload.terevel.init;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

//Thanks to Kreezxil (MFF)

@EventBusSubscriber
public class TerevelUnregister 
{
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
		
		ResourceLocation stonePickaxe = new ResourceLocation("minecraft:stone_pickaxe");
		ResourceLocation stoneAxe = new ResourceLocation("minecraft:stone_axe");
		ResourceLocation stoneShovel = new ResourceLocation("minecraft:stone_shovel");
		ResourceLocation stoneHoe = new ResourceLocation("minecraft:stone_hoe");
		ResourceLocation stoneSword = new ResourceLocation("minecraft:stone_sword");
		
		modRegistry.remove(stonePickaxe);
		modRegistry.remove(stoneAxe);
		modRegistry.remove(stoneShovel);
		modRegistry.remove(stoneHoe);
		modRegistry.remove(stoneSword);
	}
}
