
import java.io.*;

public class fun {
    int a;
    static int b;   //the variable b is a static 

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int sub(int a, int b) {      //this method is also a static method
        int c = a - b;
        return c;
    }

    public static void main(String args[])

    {
        fun ob1 = new fun();
        fun ob2 = new fun();
        System.out.println(ob1.add(12, 7));
        System.out.println(ob1.sub(12, 7));

        /*we can do the call a static method in another static method(main method) 
         * whithougt creating any object like bellow sub method 
        */
        System.out.println(sub(12, 7));
    }
}
