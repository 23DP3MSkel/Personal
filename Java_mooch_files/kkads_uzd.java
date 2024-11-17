package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] username = {"alex","emma"};
        String[] password = {"sunshine","haskell"};
        
        System.out.print("Enter username ");
        String log = scanner.nextLine();
        
        System.out.print("Enter password ");
        String login = scanner.nextLine();
        

        for (int i = 0; i<username.length;i++){
            if(log.equals(username[i])){
                if(login.equals(password[i])){
                    System.out.println("You have successfully logged in!");
                }

                else{
                    System.out.println("Incorrect username or password!");
                }
                break;
            }
            if(i == username.length-1){
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
