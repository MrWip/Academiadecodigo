package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static  Car getNewCar() {
        Car newCar;
        if((int)(Math.random() * 2) + 1 == 1){
            Position pos = new Position();
            newCar = new Fiat(pos);
        }else{
            Position pos = new Position();
            newCar = new Mustang(pos);
        }
        return newCar;
    }
}
