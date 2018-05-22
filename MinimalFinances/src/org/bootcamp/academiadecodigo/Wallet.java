package org.bootcamp.academiadecodigo;

public class Wallet {

    private static int idgenerator = 0;

    private double balance;
    private int id;

    public Wallet(int balance){
        idgenerator++;
        id = idgenerator;
        this.balance = balance;

    }

    public int setBalance(int money){

        balance = balance + money;

    }

    public double getBalance() {
        return balance;
    }

    //WALLET TO POCKET AND POCKET TO WALLET
    public boolean toPocket(int number, Person name) {
        if (number > 0 || number < balance){
            System.out.println("sucessfully transfered " + number + " to " + name + " pocket");
            return false;
        }else{
            System.out.println("not possible");
            return false;
        }
    }

    //WALLET TO WALLET
    public boolean toWallet(int number, Wallet walletId){
        if (number > balance){
            System.out.println("not enough money in the wallet to transfer");
            return false;
        }else{
            walletId.setBalance(number);
            balance = balance - number;
            System.out.println("Sucessfully transfered " + number);
            return true;
        }
    }
}
