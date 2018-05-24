package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Lamp {

    int genies;
    int totalGenies;
    int recycled;

    //CONSTRUCTOR
    public Lamp(int genies){

        this.genies = genies;
        totalGenies = genies;
    }

    //RECYCLE LAMP
    public void recycle(Demigod demon) {
        if(demon.getType() ==GenieTypes.Demon){
            Demon demon1 = (Demon) demon;
            if(demon1.isWasRecycled() == false){
                demon1.setWasRecycled(true);
                genies = totalGenies;
                recycled++;
            }

        }
    }

    //RUBBING A LAMP
    public Demigod rub(){
        Demigod currentGenie;
        if(genies <= 0){
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
                '}';
    }
}
