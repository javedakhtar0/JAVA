import java.io.Console;

class Multiplication {
     public static void main(String args[]) {
         Console c = System.console();
         int num1 = Integer.parseInt(c.readLine("Enter the First digit:"));
         int num2 = Integer.parseInt(c.readLine("Enter the Second digit:"));
         int mul = num1*num2;
         System.out.println("Multiplication of two numbers is: " + mul);
     }
    
}
