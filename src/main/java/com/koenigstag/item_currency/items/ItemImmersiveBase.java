package com.koenigstag.item_currency.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemImmersiveBase extends Item
{
    public ItemImmersiveBase(String registryName, int maxStackSize)
    {
        this.setUnlocalizedName(registryName);
        this.setRegistryName(registryName);
        this.maxStackSize = maxStackSize;
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHasSubtypes(false);
    }
}
