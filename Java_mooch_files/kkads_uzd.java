package Java_mooch_files;
import java.util.Scanner;
import java.util.ArrayList;

public class kkads_uzd {

private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> vardi = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            vardi.add(input);
        }


        System.out.println(vardi.size());

    }    
}
