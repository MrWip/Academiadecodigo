package org.academiadecodigo.bootcamp.objects;

import org.academiadecodigo.bootcamp.Destroyable;
import org.academiadecodigo.bootcamp.Game;

/**
 * Created by codecadet on 28/05/2018.
 */
public class Barrel extends GameObject implements Destroyable {

    BarrelType barrelType;
    int currentDemage;
    boolean isDestroyed;

    public Barrel(){

        int a = (int)( Math.random() * 10 + 1);
        if(a<3){
            this.barrelType = BarrelType.METAL;
        }else if(a>3 && a<6){
            this.barrelType = BarrelType.PLASTIC;
        }else{
            this.barrelType = BarrelType.WOOD;
        }
        currentDemage = 0;
        isDestroyed = false;

    }


    public boolean isDestroyed(){
        return isDestroyed;
    }


    public void hit(int demage){


    }


    @Override
    public String getMessage(){
        return "I am a barrel";
    }
}
