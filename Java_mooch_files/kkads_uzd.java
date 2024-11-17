package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int birthYearAvg = 0;
        String LongestName = "";
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            else{
                
                String[] split = input.split(",");
                birthYearAvg += Integer.valueOf(split[1]);
                count ++;
                if (LongestName.length()<split[0].length()){
                    LongestName = split[0];
                }
                
                
                }
        }
        
        
        System.out.println("longest name is "+ LongestName);
        System.out.println("Average of birth year is " + ((double) birthYearAvg / count));
        
    }
        
    }
