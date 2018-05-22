package org.bootcamp.academiadecodigo;

public class Wallet {


    private double balance;

    public Wallet(double balance){
        this.balance = balance;

    }

    public boolean setBalance(Person name, double money){

        balance = balance + money;
        return true;

    }

    public double getBalance() {
        return balance;
    }

}
