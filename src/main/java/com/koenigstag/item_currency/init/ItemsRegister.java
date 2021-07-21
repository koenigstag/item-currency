package com.koenigstag.item_currency.init;

import com.koenigstag.item_currency.items.ItemCurrencyBase;
import com.koenigstag.item_currency.items.ItemImmersiveBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public class ItemsRegister {

    public static List<Item> Currencies = new ArrayList<Item>();
    public static List<Item> ImmersiveItems = new ArrayList<Item>();
    public static List<Item> ImmersivePowders = new ArrayList<Item>();

    public static void init() {
        // Currencies
        Currencies.add(new ItemCurrencyBase("currency1", 64));
        Currencies.add(new ItemCurrencyBase("currency10", 64));
        Currencies.add(new ItemCurrencyBase("currency100", 64));
//        Currencies.add(new ItemCurrencyBase("currency1000", 64));

        // Immersive items
        ImmersiveItems.add(new ItemImmersiveBase("sawdust", 64));
        ImmersiveItems.add(new ItemImmersiveBase("metal_pressform", 64));
        ImmersiveItems.add(new ItemImmersiveBase("cellulose_fiber", 64));
        ImmersiveItems.add(new ItemImmersiveBase("creosote_sawdust", 64));
        ImmersiveItems.add(new ItemImmersiveBase("creosote_fabric", 64));
        ImmersiveItems.add(new ItemImmersiveBase("creosote_plank", 64));

        // tetrahidrite, malachite, native_copper, magnetite, hematite, limonite
        // bismuth, gold, silver, platinum, sphalerite, cassisterite, garnielite, galena
        ImmersivePowders.add(new ItemImmersiveBase("tetrahidrite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("malachite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("copper_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("magnetite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("hematite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("limonite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("bismuth_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("gold_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("silver_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("platinum_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("sphalerite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("cassisterite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("garnielite_muddy_powder", 64));
        ImmersivePowders.add(new ItemImmersiveBase("galena_muddy_powder", 64));
    }

    public static void register() {
        for (Item currency : Currencies) {
            setRegister(currency);
        }

        for (Item imm_item : ImmersiveItems) {
            setRegister(imm_item);
        }

        for (Item imm_powder : ImmersivePowders) {
            setRegister(imm_powder);
        }
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.registerAll(item);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        for (Item currency : Currencies) {
            setRender(currency);
        }

        for (Item imm_item : ImmersiveItems) {
            setRender(imm_item);
        }

        for (Item imm_powder : ImmersivePowders) {
            setRender(imm_powder);
        }
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
