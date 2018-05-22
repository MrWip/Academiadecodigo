package org.bootcamp.academiadecodigo;

import java.util.Arrays;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Hotel {

    private int availableRooms;
    private int totalRooms;
    private Rooms[] rooms;
    private int[] roomNumbers;

    public Hotel(int totalRooms){

        this.totalRooms = totalRooms;
        availableRooms = totalRooms;
        roomNumbers = new int[totalRooms];
        for(int c=0;c<totalRooms;c++){
            roomNumbers[c] = c+1;
        }
        rooms = new Rooms[totalRooms];
        for(int i=0;i<rooms.length;i++){
            rooms[i] = new Rooms();
        }


    }

    public boolean requestRoom(Person p1){
        if(availableRooms > 0){
            p1.setHasAroom(true);
            p1.setRoomkey(roomNumbers[availableRooms-1]);
            rooms[availableRooms-1].setOccupied(true);
            availableRooms--;

            return true;
        }else{
            return false;
        }

    }

    public void checkout(Person p1){
       p1.setHasAroom(false);
       availableRooms++;
       roomNumbers[availableRooms-1] = p1.getRoomkey();
       rooms[availableRooms-1].setOccupied(false);
       p1.setRoomkey(0);




    }

    @Override
    public String toString() {
        return "Hotel{" +
                "availableRooms=" + availableRooms +
                ", totalRooms=" + totalRooms +
                ", rooms=" + Arrays.toString(rooms) +
                ", roomnumbers=" + Arrays.toString(roomNumbers) +
                '}';
    }
}
