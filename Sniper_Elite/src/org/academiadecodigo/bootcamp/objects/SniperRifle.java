package org.academiadecodigo.bootcamp.objects;

/**
 * Created by codecadet on 25/05/2018.
 */
public class SniperRifle {

    int bulletDemage;

    public SniperRifle(){
        bulletDemage = 100;
    }

    public void shoot(Enemy target){
        target.hit(bulletDemage);
    }
}
