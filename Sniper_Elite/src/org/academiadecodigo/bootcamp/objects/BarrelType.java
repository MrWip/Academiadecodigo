package org.academiadecodigo.bootcamp.objects;

/**
 * Created by codecadet on 28/05/2018.
 */
public enum BarrelType {
    PLASTIC(50),
    WOOD(150),
    METAL(250);
    private int maxDemage;

     BarrelType(int maxDemage){
        this.maxDemage = maxDemage;
    }

    public int getMaDemage() {
        return maxDemage;
    }
}
