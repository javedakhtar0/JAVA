import java.io.Console;

//In this program we check the prime number
class Q5 {

    public static void main(String args[]) {
        Console c = System.console();
        // read an integer number form the user
        int num = Integer.parseInt(c.readLine("enter a number:"));
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                count++;
        }
        if (count > 0)
            System.out.println(num + " not Prime");
        else
            System.out.println(num + " is Prime");

    }
}