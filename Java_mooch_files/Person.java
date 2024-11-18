package Java_mooch_files;

public class Person {

    private String name;
    private int age;

    public Person(String InitialName){
        this.name = InitialName;
        this.age = 0;
    }

    public void printPerson(){
        System.out.println(this.name + " is " + this.age + " years old");
    }


}
