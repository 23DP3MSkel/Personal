package Java_mooch_files;

public class Account {

    private String owner;
    private double balance;

    public Account(String owner, double balance){
        this.balance = balance;
        this.owner = owner;
    }


    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double balance(){
        return this.balance;
    }
    

    @Override
    public String toString(){
        return this.owner + " balance: " + this.balance;
    }

}
