package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            else{
                System.out.println();
                String[] split = input.split(" ");
                for(int i=0; i<split.length; i++){
                    System.out.println(split[i]);
                }
                System.out.println();
            }
        }

    }
}
