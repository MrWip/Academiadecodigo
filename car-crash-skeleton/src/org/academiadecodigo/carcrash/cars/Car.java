package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed;
    private int momentum;
    private int speed;


    public Car(Position pos){
        crashed = false;
        this.pos = pos;
        momentum = (int) ( Math.random() * 4 + 1);
        speed = 1;

    }

    public int getSpeed(){
        return speed;
    }

    public int setSpeed(int number){
        speed = number;
    }

    public Position getPos() {
        return pos;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void move(){
        int oldMomentum = momentum;
        while(pos.limit(momentum)){
            System.out.println("que merda e esta");
           while(momentum == oldMomentum){
               System.out.println("wTF");
               momentum = (int) ( Math.random() * 4 + 1);
           }
        }
        switch(momentum){
            case 1:
                pos.moveUp();
                break;
            case 2:
                pos.moveDown();
                break;
            case 3:
                pos.moveRight();
                break;
            case 4:
                pos.moveLeft();
                break;
        }
    }
}
