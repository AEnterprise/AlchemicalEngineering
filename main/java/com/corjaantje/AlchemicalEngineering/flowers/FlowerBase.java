package com.corjaantje.AlchemicalEngineering.flowers;

import com.corjaantje.AlchemicalEngineering.core.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Copyright © 2015, Corjaantje
 * http://www.Corjaantje.com/
 * Licenced under the DBAD License
 * http://www.dbad-license.org/
 */
public class FlowerBase extends Block{

    protected final String name;

    public FlowerBase(String name, String registryName, Material material){
        super(material);
        this.name = name;
        setCreativeTab(Constants.FLOWERTAB);
        GameRegistry.registerBlock(this, registryName);
        setHardness(0F);
        setStepSound(soundTypeGrass);
        setBlockBounds(0.3F, 0.0F, 0.3F, 0.8F, 1, 0.8F);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
