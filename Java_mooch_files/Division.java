package Java_mooch_files;
import java.util.Scanner;
public class Division {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //divide(5,3);
        divisibleByThree(2,10);

    }
    public static void divide(int pirm, int otr){
        System.out.println((double)pirm/otr);
    }
    public static void divisibleByThree(int first, int second){
        while(first<=second){
            if(first % 3 == 0){
            System.out.println(first);
            
            }
            first++;
        }
        
       
    }
}
