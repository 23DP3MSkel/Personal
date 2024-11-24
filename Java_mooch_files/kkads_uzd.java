package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            else{
                System.out.print("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());

                System.out.print("year: ");
                int year = Integer.valueOf(scanner.nextLine());

                books.add(new Book(title, pages, year));
            }
        }

        System.out.print("what do you want to be printed: ");
        String input = scanner.nextLine();

        for(Book var:books){
            if (input.equals("everything")){
                System.out.println(var);
            }
            else if (input.equals("name")){
                System.out.println(var.name());
            }
        }
        
        
    }
}
