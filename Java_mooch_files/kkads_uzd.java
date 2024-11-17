package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] username = {"alex","emma"};
        String[] password = {"sunshine","haskell"};
        
        System.out.print("Enter username ");
        String enteredUsername = scanner.nextLine();
        
        System.out.print("Enter password ");
        String enteredPassword = scanner.nextLine();
        

        for (int i = 0; i<username.length;i++){
            if(enteredUsername.equals(username[i]) && enteredPassword.equals(password[i])){
                System.out.println("You logged in!");
                return;
            }
        }

        System.out.println("Incorrect username or password");
    }
}
