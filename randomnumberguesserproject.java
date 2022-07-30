
import java.util.Scanner;

public class randomnumberguesserproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int i = 1;
        while(i>0){
            System.out.println("guess a number");
            int n = sc.nextInt();
            if(n>2579){
                System.out.println("number greater than correct numever, try again");
                continue;
            }
            if(n<2579){
                System.out.println("number smaller than correct number, try again");
                continue;
            
                }
                else 
                System.out.println("correct");
                break;
            }
        
        System.out.println("THE END!!");
        }



        
    }
    

