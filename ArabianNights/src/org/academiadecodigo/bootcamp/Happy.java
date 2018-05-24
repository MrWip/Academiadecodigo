package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Happy extends Demigod {


    public Happy(){
        super(GenieTypes.happyG);
    }


    @Override
    public void concedeWish(){
       if(getNumberOfWishes() > 0){
           super.concedeWish();
       }
    }


}
