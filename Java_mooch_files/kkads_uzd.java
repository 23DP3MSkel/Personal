package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 3;

        System.out.print("Search for? ");
        int find = Integer.valueOf(scanner.nextLine());
        int found = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == find){
                found = i;
                System.out.println(find + " is at index "+ found);
                break;
            }
            if(i == numbers.length-1){
                System.out.println(find +" was not found");
                break;
            }

        }





    
        

       
    }
}
