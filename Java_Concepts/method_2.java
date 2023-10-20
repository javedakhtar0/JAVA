package JAVA.ProgrammingConcepts;
//Console is a class which is read input from the user as a string
import java.io.Console;

//this is a class which name is method_2
class method_2 {

    //declairation of two integer variables
    int num1, num2;

    //Define a method with name input which is get the input from the user
    void input() {

        //call console method by System calss by which we can read any input fromthe user
        Console c = System.console();

        //read two integer value and assign it in Variables
        num1 = Integer.parseInt(c.readLine("Enter the first number: "));
        num2 = Integer.parseInt(c.readLine("Enter the second number: "));

    }

    //great method return the greatest number
    int great() {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /*
     * int small()
     * {
     * if(num1<num2)
     * return num1;
     * else
     * return num2;
     * }
     */

     //check that greatest number is even or odd
    void check() {
        if (great() % 2 == 0)
            System.out.println(great() + " is greatest and even number");
        else
            System.out.println(great() + " is greatest and odd number");
    }

    public static void main(String args[]) {

        //create an object with name ob
        method_2 ob = new method_2();

        //method called by the help of object
        ob.input();
        ob.great();
        ob.check();

    }
}