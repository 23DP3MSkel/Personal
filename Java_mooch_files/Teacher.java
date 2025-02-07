package Java_mooch_files;

public class Teacher extends Person {

    public int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;

    }

    public String toString(){
        return super.toString() + "\n\t" + "salary " + this.salary + " euro/month";
    }
    
}
