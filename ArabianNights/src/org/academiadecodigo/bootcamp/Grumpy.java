package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Grumpy extends Demigod {

    private int concededWishes;

    public Grumpy(){
        super(GenieTypes.grumpyG);
        concededWishes = 1;

    }

    @Override
    public void concedeWish(){
       if(concededWishes > 0){
           super.concedeWish();
           concededWishes--;
       }
    }





}
