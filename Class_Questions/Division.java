import java.io.Console;

class Division {
     public static void main(String args[]) {
         Console c = System.console();
         int num1 = Integer.parseInt(c.readLine("Enter the First digit:"));
         int num2 = Integer.parseInt(c.readLine("Enter the Second digit:"));
         int div = num1/num2;
         System.out.println("Division of two numbers is: " + div);
     }
    
}
