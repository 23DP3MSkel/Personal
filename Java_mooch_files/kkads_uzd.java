package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();


        System.out.println("enter the numbers:");


        while(input){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            allNumbers.addNumber(input);
            if(input % 2 == 0){
                evenNumbers.addNumber(input);
            }
            else{
                oddNumbers.addNumber(input);
            }
        }
        System.out.println("Sum: "+ allNumbers.sum());
        System.out.println("Sum of even numbers: "+ evenNumbers.sum());
        System.out.println("Sum of odd numbers: "+ oddNumbers.sum());

        
        
    }
        
    }
