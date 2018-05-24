package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 24/05/2018.
 */
public class Fiat extends Car{


    public Fiat(Position pos){
        super(pos);
        setSpeed(2);
    }


    @Override
    public String toString() {
        return "F";
    }
}
