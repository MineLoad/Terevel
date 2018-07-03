package me.mineload.terevel.init.blocks;

import me.mineload.terevel.main.Instances;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TerevelMainBlock extends Block
{
	public TerevelMainBlock(Material material, SoundType soundtype, String toolClass, int harvestlevel, float resistance, int opacity, float lightlevel, float hardness) 
	{
		super(material);
		BlockStates(soundtype, toolClass, harvestlevel, resistance, opacity, lightlevel, hardness);
	}
	
	public void BlockStates(SoundType soundtype, String toolClass, int harvestlevel, float resistance, int opacity, float lightlevel, float hardness)
	{
		setSoundType(soundtype);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel(toolClass, harvestlevel);
		setResistance(resistance);
		setLightOpacity(15-opacity);
		setLightLevel(lightlevel);
		setHardness(hardness);
	}
}
