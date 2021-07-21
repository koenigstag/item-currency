package com.koenigstag.item_currency;

import com.koenigstag.item_currency.init.ItemsRegister;
import com.koenigstag.item_currency.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    @Mod.Instance
    public static ExampleMod instance;

    @SidedProxy(clientSide = "com.koenigstag.item_currency.proxy.ClientProxy", serverSide = "com.koenigstag.item_currency.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final String MODID = "item_currency";
    public static final String NAME = "Item Currency";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
