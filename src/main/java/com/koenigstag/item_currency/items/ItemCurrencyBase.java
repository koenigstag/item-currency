package com.koenigstag.item_currency.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCurrencyBase extends Item
{
    public ItemCurrencyBase(String registryName, int maxStackSize)
    {
        this.setUnlocalizedName(registryName);
        this.setRegistryName(registryName);
        this.maxStackSize = maxStackSize;
        this.setCreativeTab(CreativeTabs.MISC);
        this.setHasSubtypes(false);
    }
}