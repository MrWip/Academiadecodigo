package org.bootcamp.academiadecodigo;

public class Person {

    private String name ;
    private double pocket;
    private Wallet walletid;
    private int pin;

    public Person(String name, double money){

        this.name = name;
        pocket = money;
    }

    public double getPocketBalance() {
        return pocket;
    }

    public void setPocketBalance(int money) {
        pocket = pocket + money;
    }

    // PERSON - WALLET

    public void createWallet(int walletMoney){

        walletid = new Wallet(walletMoney);
    }

    public Wallet getWalletid() {
        return walletid;
    }

    //PERSON TO BANK

    public void createAcc(int pin){


    }




}
