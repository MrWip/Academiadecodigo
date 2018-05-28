package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.objects.ArmouredEnemy;
import org.academiadecodigo.bootcamp.objects.Enemy;
import org.academiadecodigo.bootcamp.objects.GameObject;
import org.academiadecodigo.bootcamp.objects.SoldierEnemy;
import org.academiadecodigo.bootcamp.objects.SniperRifle;
import org.academiadecodigo.bootcamp.objects.Tree;

/**
 * Created by codecadet on 25/05/2018.
 */
public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game(){
        sniperRifle = new SniperRifle();
        shotsFired = 0;
    }


    public void start(int numberOfObjects){

        gameObjects = new GameObject[numberOfObjects];
        createObjects(numberOfObjects);
        for(int i=0;i<numberOfObjects;i++){
            if(gameObjects[i] instanceof Tree){
                continue;
            }else{
                Enemy itsAnEnemy = (Enemy) gameObjects[i];
                while(itsAnEnemy.isDead() == false){
                    sniperRifle.shoot((Enemy) gameObjects[i]);
                    shotsFired++;
                }
            }
        }
        System.out.println("SHOTS FIRED:"+ shotsFired);


    }

    private void createObjects(int numberOfObjects){
        int random = (int) ( Math.random() * 10 + 1);
        for(int i=0;i<numberOfObjects;i++){
            if(random<6){
                if(random <4){
                    gameObjects[i] = new SoldierEnemy();
                    System.out.println(gameObjects[i].getMessage());
                }else{
                    gameObjects[i] = new ArmouredEnemy();
                    System.out.println(gameObjects[i].getMessage());
                }
            }else if(random >6 && random <9){


            }else{
                gameObjects[i] = new Tree();
                System.out.println(gameObjects[i].getMessage());
            }
        }
    }





}
