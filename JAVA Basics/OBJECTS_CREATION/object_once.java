
// use of anonymous object (it is good for one time object use)

public class object_once { // main class

    String name = "javed akhtar";
    int fact = 1;

    public object_once() {
        System.out.println(name);
    }

    void factorial(int n) // method for finding the factorial of a number
    {
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // display output after calculting factorial
        System.out.println("factorial of " + n + " is " + fact);
        System.out.println("successfully run!");
    }

    public static void main(String args[]) // main driver method
    {
        // create object
        new object_once(); // anonymous object
        new object_once().factorial(5);

    }

}
