package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Demigod {

    private boolean recycled;
   private int numberOfWishes;


    public Demigod(){
        numberOfWishes = 5;
        recycled = true;
    }

    public void concedeWish(){
        numberOfWishes--;
    }

    // getter setter
    public int getNumberOfWishes() {
        return numberOfWishes;
    }

    public boolean isRecycled() {
        return recycled;
    }

    public void setRecycled(boolean recycled) {
        this.recycled = recycled;
    }

    //RECYCLE
    public void recycle(Lamp lamp){
        if(recycled = false){
            lamp.setGenies();
            recycled = true;
        }
    }

    @Override
    public String toString() {
        return "Demigod{" +
                "numberOfWishes=" + numberOfWishes +
                '}';
    }
}
