package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account MatthewsAccount = new Account("Matthews account", 1000);
        Account MyAccount = new Account("My account", 0);

        MatthewsAccount.withdraw(100);
        
        MyAccount.deposit(100);
        
        
        System.out.println(MatthewsAccount);
        System.out.println(MyAccount);
        
        
    }
        
    }
