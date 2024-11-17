package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int[] numbers = new int[5];
    for (int i=0; i<5; i++){
        numbers[i] = Integer.valueOf(scanner.nextLine());
    }
    
    System.out.println();
    System.out.println("Which to swap?");
    int first = Integer.valueOf(scanner.nextLine());
    int second = Integer.valueOf(scanner.nextLine());
    int temp = numbers[first];
    numbers[first] = numbers[second];
    numbers[second] = temp;
    System.out.println("");

    for (int i=0; i<5;i++){
        System.out.println(numbers[i]);
    }

        

       
    }
}
