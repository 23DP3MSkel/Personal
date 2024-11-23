package Java_mooch_files;

public class PaymentCard {

    private double amount;
    //private double deposit;

    public PaymentCard(double amount){
        this.amount = amount;
    }

    public String toString(){
        return "The card has a balance of " + this.amount + " euros";
    }
    
    public void eatAffordibly(){
        if(this.amount>2.59){
            this.amount -= 2.60;
        }
    }

    public void eatHeartily(){
        if(this.amount > 4.59){
            this.amount -= 4.60;
        }
    }

    public void addMoney(double deposit){
        if(deposit<0){
            return;
        }
        
        if((this.amount + deposit)<151){
            this.amount += deposit;
        }
        else{
            this.amount = 150;
        }
    }
    
}
