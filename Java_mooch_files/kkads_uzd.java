package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    int oldest = -1;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            else{
                
                String[] split = input.split(",");
                int age = Integer.valueOf(split[1]);
                if (age > oldest){
                    oldest = age;
                }
                }
            }
            System.out.println("oldest is "+oldest);
        }
        
    }
