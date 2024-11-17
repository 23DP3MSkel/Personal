package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    
    public static void printArrayInStars(int[] array){
        for(int i=0;i<array.length;i++){
            for(int s=0; s<array[i];s++){
                System.err.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        
        
        int[] numbers = {5, 1, 3, 4, 2};
        printArrayInStars(numbers);

       
    }
}
