package org.academiadecodigo.carcrash.cars;


import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 24/05/2018.
 */
public class Mustang extends Car {

    int color;

    public Mustang(Position pos){
        super(pos);
        color = 1;

    }
    @Override
    public String toString() {
        return "M";
    }
}
