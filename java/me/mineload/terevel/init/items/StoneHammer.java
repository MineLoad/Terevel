package me.mineload.terevel.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StoneHammer extends Item
{
	public StoneHammer()
	{
		setCreativeTab(CreativeTabs.MATERIALS);
		setMaxDamage(512);
		setMaxStackSize(1);
		setNoRepair();
	}
}
