package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> vardi = new ArrayList<>();
       

        while (true){
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input.equals(-1)){
                break;
            }
            vardi.add(input);
        
        }

        
        System.out.println("search for?");
        int number = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i<vardi.size();i++){

            if(vardi.get(i) == number){
                System.out.println(number + " is at index "+ i);
            }
        }

        

    }    
}
