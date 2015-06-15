package com.corjaantje.AlchemicalEngineering;

import com.corjaantje.AlchemicalEngineering.core.Constants;
import com.corjaantje.AlchemicalEngineering.flowers.FlowerBase;
import com.corjaantje.AlchemicalEngineering.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Copyright © 2015, ${USER}
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
        FlowerBase.registerBlocks();
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent){
    }


}
