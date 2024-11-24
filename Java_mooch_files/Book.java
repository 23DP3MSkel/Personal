package Java_mooch_files;

public class Book {

    private int year;
    private String name;
    private int pages;

    public Book(String name, int pages, int year){
        this.year = year;
        this.name = name;
        this.pages = pages;
    }

    public String name(){
        return this.name;
    }

    public String toString(){
        return this.name + ", pages: " + this.pages + ", year: " + this.year;
    }

}
