package Java_mooch_files;

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.amount = initialQuantity;
    }

    public void printProduct(){
        System.out.println(this.name + ", price: "+ this.price + ", " + this.amount + " pcs");
    }




}
