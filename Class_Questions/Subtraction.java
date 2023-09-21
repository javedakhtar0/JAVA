 import java.io.Console;

 class Subtraction {
     public static void main(String args[]) {
         Console c = System.console();
         int num1 = Integer.parseInt(c.readLine("Enter the First number:"));
         int num2 = Integer.parseInt(c.readLine("Enter the Second number:"));
         int sub = num1 - num2;
         System.out.println("Subtraction of two numbers: " + sub);
     }
 }
