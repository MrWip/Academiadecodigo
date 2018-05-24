package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Demigod {

   private int numberOfWishes;
   private GenieTypes type;


    public Demigod(GenieTypes type){
        numberOfWishes = 5;
        this.type = type;
    }

    public void concedeWish(){
        numberOfWishes--;
    }

    // getter setter
    public int getNumberOfWishes() {
        return numberOfWishes;
    }


    public GenieTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Demigod{" +
                "numberOfWishes=" + numberOfWishes +
                '}';
    }
}
