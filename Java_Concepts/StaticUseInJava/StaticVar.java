import java.io.*;

public class StaticVar {
    int num1 = 'a'; // in the variable a not store a char value it stored ASCI value of a
    static int num2 = 'A'; // it'salso work like above variable

    public static void main(String args[]) {
        Console c = System.console();

        StaticVar ob1 = new StaticVar();
        StaticVar ob2 = new StaticVar();
        StaticVar ob3 = new StaticVar();

        System.out.println(ob1.num1);
        System.out.println(ob1.num2);
        System.out.println(ob2.num1);
        System.out.println(ob2.num2);
       
        // we can also access static variable in static method without creatting objects
        System.out.println("numbers num2 :" + (num2));

        /*
         * The bellow given statement occure an error because we can
         * not access non-staict avriable in static method
         */
        // System.out.println("numbers num1 :" + (num1));
    }
}
