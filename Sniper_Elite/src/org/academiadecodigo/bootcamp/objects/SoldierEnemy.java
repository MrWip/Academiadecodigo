package org.academiadecodigo.bootcamp.objects;

/**
 * Created by codecadet on 25/05/2018.
 */
public class SoldierEnemy extends Enemy {

    public SoldierEnemy(){

    }

    @Override
    public String getMessage(){
        return "I am a soldier";
    }

    @Override
    public void hit(int demage){
        System.out.println("AHHHHHH im gonna die");
        super.hit(demage-5);
    }


}
