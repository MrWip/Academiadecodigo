package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 24/05/2018.
 */
public class Fiat extends Car{

    int color;

    public Fiat(Position pos){
        super(pos);
        color = 2;
    }

    @Override
    public String toString() {
        return "F";
    }
}
