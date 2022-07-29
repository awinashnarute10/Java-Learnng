public class cont {
    public static void main(String[] args) {
        int i = 0;
        while(true){
     if (i==3) {
        i = i + 1;
        continue;  //here continue doeesnt matter

        
     }
      System.out.println(i);
      i = i + 1;
      if(i>5){
        break;
      }

        }
        System.out.println("Khatam bhai");
        
    }
    
}
