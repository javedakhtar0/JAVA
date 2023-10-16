package JAVA.ProgrammingConcepts;
import java.io.Console;
class Test3{
		public static void main(String args[])
{		
		Console c=System.console();
		String s=c.readLine("Enter The Book Name:");
		String s1=c.readLine("Enter The Aouther Name:");
		String s2=c.readLine("Enter The Publisher Name:");
		System.out.println("Basic Details of a Book: ");
		System.out.println("Book_Name: " +s);
		System.out.println("Aouther_Name: " +s1);
		System.out.println("Publisher_Name: " +s2);}
}