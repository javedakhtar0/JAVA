import java.io.Console;

class Modulo 
 {
     public static void main(String args[]) {
         Console c = System.console();
         int num = Integer.parseInt(c.readLine("Enter the First number:"));
         int num2 = Integer.parseInt(c.readLine("Enter the Second number:"));
         int mod = num%num2;
         System.out.println("Modulo of two number is: " + mod);
     }
    
}
