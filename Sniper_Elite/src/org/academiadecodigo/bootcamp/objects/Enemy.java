package org.academiadecodigo.bootcamp.objects;

/**
 * Created by codecadet on 25/05/2018.
 */
public abstract class Enemy extends GameObject {

    private int health;
    private boolean isDead;

    public Enemy(){
        health = 100;
        isDead = false;
    }

    private void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDead() {
        return isDead;
    }

    public void hit(int demage){
        health = health - demage;
        if(health <= 0){
            setDead(true);
            System.out.println("YOU KILLED ME");
        }
    }
}
