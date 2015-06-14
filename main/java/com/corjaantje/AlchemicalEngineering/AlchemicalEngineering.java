package com.corjaantje.AlchemicalEngineering;

import com.corjaantje.AlchemicalEngineering.core.Constants;
import com.corjaantje.AlchemicalEngineering.proxy.ServerProxy;
import com.corjaantje.AlchemicalEngineering.registry.FlowerRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Corjaantje on 6/14/2015.
 */

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.MODVERSION)
public class AlchemicalEngineering {

    @SidedProxy(clientSide = Constants.CLIENTSIDE, serverSide = Constants.SERVERSIDE)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent){
        FlowerRegister.AlchemicalEngineering();
        proxy.registerRenderInfo();
    }

    @Mod.EventHandler
    public static void Load(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent){
    }


}
