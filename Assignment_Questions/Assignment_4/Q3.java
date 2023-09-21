import java.io.Console;
class Q3{
    public static void main(String[] args)
    {
        Console c=System.console();
        int num = Integer.parseInt(c.readLine("enter the number:"));
        if(num%2==0)
            System.out.println(num + " is a even number");
        else
            System.out.println(num + " is a odd number");

    }
}