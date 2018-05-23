package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Lamp {

    int genies;
    int totalGenies;
    int recycled;
    Demigod currentGenie;

    //CONSTRUCTOR
    public Lamp(int genies){

        this.genies = genies;
        totalGenies = genies;

    }

    //GETTER SETTER
    //RECYCLE LAMP
    public void setGenies() {

        genies = totalGenies;
        recycled++;
    }

    //RUBBING A LAMP
    public Demigod rub(){
        if(genies <= 0){
            if(genies < 0 ){
                return currentGenie;
            }
            currentGenie = new Demon();
            return currentGenie;
        }
        else{
            if((int)(Math.random() * 2) + 1 == 1){
                currentGenie = new Happy();
                genies--;
                return currentGenie;
            }else{
                currentGenie = new Grumpy();
                genies--;
                return currentGenie;
            }
        }

    }

    //COMPARING LAMPS
    public boolean equals(Lamp lamp2){

        if(this.genies == lamp2.genies && this.totalGenies == lamp2.totalGenies && this.recycled == lamp2.recycled){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Lamp{" +
                "genies=" + genies +
                ", totalGenies=" + totalGenies +
                ", recycled=" + recycled +
                ", currentGenie=" + currentGenie +
                '}';
    }
}
