import java.io.*;
import java.util.Scanner;
  public  class Q4{
		public static void main(String args[])
		{
			Console c=System.console();
			int num1,num2;
			//read integer num1
			num1=Integer.parseInt(c.readLine("Enter the number1:"));
			//read integer num2
			num2=Integer.parseInt(c.readLine("Enetr the second number2:"));
			System.out.print("enter the charactor:");
			Scanner sc=new Scanner(System.in);
			//reading a charactor
			char C=sc.next().charAt(0);
			switch(C){
				case '+':
					System.out.println("Addition of two number is "+(num1+num2));
					break;
				case '-':
					System.out.println("Subtraction of two number is "+(num1-num2));
					break;
				case '*':
					System.out.println("Multiplication of two number is "+(num1*num2));
					break;
				case '/':
					System.out.println("Division of two number is "+(num1/num2));
					break;
				case '%':
					System.out.println("Modulo of two number is "+(num1%num2));
					break;
				default:
					System.out.println("Enter the right Charactor!");
			}

		}
	}