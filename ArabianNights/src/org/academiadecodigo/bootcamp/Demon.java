package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Demon extends Demigod {


    private boolean wasRecycled;

    public Demon(){
        super(GenieTypes.Demon);
        wasRecycled = false;
    }


    public void setWasRecycled(boolean wasRecycled) {
        this.wasRecycled = wasRecycled;
    }

    //CONCEDE WISHES
    @Override
    public void concedeWish(){
        if(wasRecycled == false){
            super.concedeWish();
        }
    }

    @Override
    public String toString() {
        return "Demon{" +
                "wasRecycled=" + wasRecycled +
                '}';
    }
}
