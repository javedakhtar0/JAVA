import java.io.Console;
class prime {
     public static void main(String[] args)
    {
        Console c=System.console();
        int num = Integer.parseInt(c.readLine("enter the number:"));
        for(int i=2;i<=num/2;i++)
        {
            if (num % i == 0){
                System.out.println(num + " is a prime number");
                break;
            } }
                System.out.println(num + " is not a prime number");

    }
}

