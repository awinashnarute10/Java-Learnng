import java.util.Arrays;
import java.util.Scanner;


public class practice {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n-1; i>=1; i--){
             n = n*i;


        }
        System.out.println(n);
        

    }
     

}

