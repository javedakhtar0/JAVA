import java.io.Console;
class Q10 {
     public static void main(String args[]) {
         Console c = System.console();
         int num = Integer.parseInt(c.readLine("Enter the First number:"));
         if(num%5==0 && num%7==0)
         {
             System.out.println(num+" is Divisible");
         }
         else{
             System.out.println(num+" is Not Divisible");
         }
          
          System.out.println("Thank u!");
     }
}
