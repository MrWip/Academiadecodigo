package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 22/05/2018.
 */
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ze");
        System.out.println(p1);
        Hotel h1 = new Hotel(3);
        System.out.println(h1);
        System.out.println("--------- check in");
        p1.checkIn(h1);
        System.out.println(p1);
        System.out.println(h1);
        p1.checkOut(h1);
        System.out.println("--------- check out");
        System.out.println(p1);
        System.out.println(h1);

    }

}
