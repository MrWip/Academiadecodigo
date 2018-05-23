package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Demon extends Demigod {


    public Demon(){

        setRecycled(false);

    }



    //CONCEDE WISHES
    @Override
    public void concedeWish(){
        if(isRecycled() == false){
            super.concedeWish();
        }

    }



    @Override
    public String toString() {
        return "Demon{" +
                "recycled=" + isRecycled() +
                '}';
    }
}
