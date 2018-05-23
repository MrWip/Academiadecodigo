package org.bootcamp.academiadecodigo;

import java.util.Arrays;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Hotel {

    private int availableRooms;
    private int totalRooms;
    private Rooms[] rooms;
    private int[] keys;
    private Person[] guests;

    //CONSTRUCTOR

    public Hotel(int totalRooms){
        this.totalRooms = totalRooms;
        availableRooms = totalRooms;
        keys = new int[totalRooms];
        guests = new Person[totalRooms];
        for(int c=0;c<totalRooms;c++){
            keys[c] = c+1;
        }
        rooms = new Rooms[totalRooms];
        for(int i=0;i<rooms.length;i++){
            rooms[i] = new Rooms();
        }
    }

    //CHECK IN AND OUT

    public boolean requestRoom(Person p1){
        if(availableRooms > 0){
            p1.setHasAroom(true);
            p1.setRoomkey(keys[availableRooms-1]);
            keys[availableRooms-1] = 0;
            rooms[availableRooms-1].setOccupied(true);
            guests[availableRooms-1] = p1;
            availableRooms--;
            return true;
        }else{
            return false;
        }
    }

    public void checkout(Person p1){
        if(isClient(p1) == false){
            return;
        }
        p1.setHasAroom(false);
        availableRooms++;
        keys[availableRooms-1] = p1.getRoomkey();
        rooms[availableRooms-1].setOccupied(false);
        rooms[availableRooms-1].occupied = false;
        p1.setRoomkey(0);
    }

    //IS A CLIENT???
    private boolean isClient(Person p1){

        for(int i=0; i<guests.length;i++){
            if(p1 == guests[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "availableRooms=" + availableRooms +
                ", totalRooms=" + totalRooms +
                ", rooms=" + Arrays.toString(rooms) +
                ", roomnumbers=" + Arrays.toString(keys) +
                '}';
    }
}
