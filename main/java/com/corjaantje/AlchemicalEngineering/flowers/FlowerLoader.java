package com.corjaantje.AlchemicalEngineering.flowers;



/**
 * Copyright © 2015, Corjaantje
 * http://www.Corjaantje.com/
 * Licenced under the DBAD License
 * http://www.dbad-license.org/
 */

public class FlowerLoader {
    public static FlowerBase fireFlower;
    public static FlowerBase earthFlower;
    public static FlowerBase airFlower;
    public static FlowerBase waterFlower;
    public static FlowerBase shadowFlower;
    public static FlowerBase lightFlower;

    public static void loadFlowers(){

        fireFlower = new FlowerFire();
        earthFlower = new FlowerEarth();
        airFlower = new FlowerAir();
        waterFlower = new FlowerWater();
        lightFlower = new FlowerLight();
        shadowFlower = new FlowerShadow();

    }

}
