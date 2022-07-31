
import java.util.Scanner;

public class randomnumberguesserproject {
    public static void main(String[] args) {

        int i = 1;
        int m = (int) (Math.random() * 100);
        while (i > 0) {
            System.out.println("guess a number");
            try {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                //

                if (n < 0) {
                    System.out.println("You chose to quit");
                    break;
                } else if (n > m) {
                    System.out.println("number greater than correct numever, try again");

                } else if (n < m) {
                    System.out.println("number smaller than correct number, try again");
                    // continue;

                } else {
                    System.out.println("correct");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Incorrect format please type an integer");
                continue;

            }
        }

        System.out.println("THE END!!");
    }

}
