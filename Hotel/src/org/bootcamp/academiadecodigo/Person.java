package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Person {

    private String name;
    private boolean hasAroom;
    private int roomkey;

    public Person(String name){

        this.name = name;
        hasAroom = false;

    }

    public void setRoomkey(int roomkey) {
        this.roomkey = roomkey;
    }

    public int getRoomkey() {
        return roomkey;
    }

    public void setHasAroom(boolean hasAroom) {
        this.hasAroom = hasAroom;
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
