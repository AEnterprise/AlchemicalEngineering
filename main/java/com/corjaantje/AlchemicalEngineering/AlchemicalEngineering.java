package com.corjaantje.AlchemicalEngineering;

import com.corjaantje.AlchemicalEngineering.core.Constants;
import com.corjaantje.AlchemicalEngineering.flowers.FlowerBase;
import com.corjaantje.AlchemicalEngineering.flowers.FlowerLoader;
import com.corjaantje.AlchemicalEngineering.proxy.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright © 2015, Corjaantje
 * http://www.Corjaantje.com/
 * Licenced under the DBAD License
 * http://www.dbad-license.org/
 */

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.MODVERSION)
public class AlchemicalEngineering {

    @SidedProxy(clientSide = Constants.CLIENTSIDE, serverSide = Constants.SERVERSIDE)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent){
        proxy.registerRenderInfo();
    }

    @Mod.EventHandler
    public static void Load(FMLInitializationEvent event){
        FlowerLoader.loadFlowers();
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent){
    }


}
