import java.util.Scanner;
import java.util.Arrays;

public class dowhileloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = -1;
        do {
            System.out.println("Imput a number- ");
             number = sc.nextInt();
            System.out.print("here is your number-");
            System.out.println(number);

        }
        while(number>=0);
        System.out.println("THE END");

        
    }
    
}
