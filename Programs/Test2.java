import java.io.Console;
class Test2{
		public static void main(String args[])
{		
		Console c=System.console();
		String s=c.readLine("Enter your First name:");
		String s1=c.readLine("Enter your MIddle name:");
		String s2=c.readLine("Enter your Last name:");
		System.out.println("your full name is " +s +s1 +s2);}
}
