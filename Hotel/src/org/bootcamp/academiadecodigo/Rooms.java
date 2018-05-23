package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Rooms {


    boolean occupied;

    public Rooms(){
        occupied = false;
    }

    //SETTERS AND GETTERS

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                ", occupied=" + occupied +
                '}';
    }
}
