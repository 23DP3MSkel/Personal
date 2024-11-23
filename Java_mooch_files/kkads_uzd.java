package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        PaymentCard PaulsCard = new PaymentCard(20);
        PaymentCard MattsCard = new PaymentCard(30);
        
        
        PaulsCard.eatHeartily();
        MattsCard.eatAffordibly();

        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);

        PaulsCard.addMoney(20);

        MattsCard.eatHeartily();

        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);

        PaulsCard.eatAffordibly();
        PaulsCard.eatAffordibly();

        MattsCard.addMoney(50);

        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);
        
        
        
        
        
    }
}
