
import java.util.Scanner;

public class adcdvs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        String playing;
        int age;

        do {

            System.out.println("Enter your name");
            name = in.nextLine();

            System.out.println("Enter your age");
            age = in.nextInt();

            System.out.println("Play again?");
            playing = in.next();

        } while (true);

    }

}
