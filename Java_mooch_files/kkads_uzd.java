package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static int sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        System.out.println("the sum is: "+ sum);
        return sum;
    }

    public static void main(String[] args) {
        
        
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);

       
    }
}
