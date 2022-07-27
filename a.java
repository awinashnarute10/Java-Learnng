
import java.util.Arrays;
import java.util.Scanner;
// pen= 10 book=40


public class a {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How much money doyou have?");
    int money = sc.nextInt();
    if (money < 10)
     System.out.println("Get out of the store!!");
     else if ( money < 40)  
      System.out.println("You can only have pen");
   
       else if (money == 40) 
       System.out.println("You can have 1 book or 4 pens");
       else if  (money >= 50)
       System.out.println("You can have both or 5 pens atleast");
         
       

     
      



   
       
    
   
    
    
    
 } 
}
