package com.corjaantje.AlchemicalEngineering.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Copyright © 2015, ${USER}
 * http://www.Corjaantje.com/
 * Licenced under the DBAD License
 * http://www.dbad-license.org/
 */
public class FlowerBase extends Block{

    protected final String name;

    public FlowerBase(String name, String registryName, Material material, CreativeTabs tab){
        super(material);
        this.name = name;
        setCreativeTab(tab);
        GameRegistry.registerBlock(this, registryName);
        setHardness(0F);
        setStepSound(soundTypeGrass);
        setBlockBounds(0.3F, 0.0F, 0.3F, 0.8F, 1, 0.8F);
    }



}
