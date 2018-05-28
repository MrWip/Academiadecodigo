package org.academiadecodigo.bootcamp.objects;

/**
 * Created by codecadet on 25/05/2018.
 */
public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(){
        armour = 100;
    }

    @Override
    public void hit(int demage){

        System.out.println("FUCK IM HIT");
        if(armour <= 0){
            super.hit(Math.abs(armour)+demage);
            armour = 0;
        }else{
            armour = armour - demage;
        }
    }

    @Override
    public String getMessage(){
        return "I am a armored Soldier";
    }

}
