package org.bootcamp.academiadecodigo;

public class Person {

    private String name ;
    private double pocket;
    private double walletBalance;
    private Wallet walletid;
    private Bank acc;

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

    public void createWallet(double walletMoney){

        walletid = new Wallet(walletMoney);
        walletBalance = walletid.getBalance();

    }

    public Wallet getWalletid() {
        return walletid;
    }

    public boolean pocketToWallet(double number){
        if(pocket<number){
            System.out.println("not enough money in your pocket");
            return false;
        }else{
            System.out.println("Successfully transfered " + number);
            pocket = pocket - number;
            walletid.setBalance(this, number);
            return true;
        }
    }

    public boolean walletToPocket(double number){
        if(walletid.getBalance() < number){
            System.out.println("not enough money in the wallet");
            return false;
        }else{
            walletid.setBalance(this, (number*-1));
            pocket = pocket + number;
            System.out.println("Sucessfully transfered " + number);
            return true;
        }
    }

    //PERSON TO BANK

    public void createAcc(int money){

        acc = new Bank(money,this);
    }

    public boolean toBank(double money){

        //acc.transferIn(money);
        walletid.setBalance(this, (money*-1));
        return true;

    }

    public  boolean FromBank(double money){

        //
        // acc.transferOut(money);
        walletid.setBalance(this,money);
        return true;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
