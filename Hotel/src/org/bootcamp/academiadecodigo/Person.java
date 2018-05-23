package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Person {

    private String name;
    private boolean hasAroom;
    private int roomkey;

    //CONSTRUCTOR

    public Person(String name){

        this.name = name;
        hasAroom = false;

    }

    //GETTERS AND SETTERS

    public void setRoomkey(int roomkey) {
        this.roomkey = roomkey;
    }

    public int getRoomkey() {
        return roomkey;
    }

    public void setHasAroom(boolean hasAroom) {
        this.hasAroom = hasAroom;
    }

    //Check in and out methods

    public void checkIn(Hotel h1){
        h1.requestRoom(this);
    }

    public void checkOut(Hotel h1){
        h1.checkout(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hasAroom=" + hasAroom +
                ", roomkey=" + roomkey +
                '}';
    }
}
