package Java_mooch_files;
import java.util.Scanner;
public class ParameterAndOne {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //printFromNumberToOne(5);
        printUntilNumber(2);
        
    }
    public static void printFromNumberToOne(int izveletais){
        int nulle = 0;
        while(nulle<izveletais){
            System.out.println(izveletais);
            izveletais--;
        }

    }
    public static void printUntilNumber(int lietotajs){
        int viens = 1;
        while(viens != lietotajs +1){
             System.out.println(viens);
             viens++;
        }
    }
}