/*this program give output af salesman's commission according to area
 * there are three area like x,y and z.
 * first of all we get the sales amount from the user by the help of get_amount method
 * after getting sales amount display salesman commission on the bassis of his area
 */

import java.io.Console;

class Q5 {

<<<<<<< HEAD:Assignment_Questions/Assignment_6/Q5.java
    int amnt, comsn;
=======
    double amnt, comsn;
>>>>>>> d65a8e060dd9c9425d1a7b08ce5af197405f03c1:Java_Questions/Assignment_6/Q5.java
    static Console c = System.console();

    void get_amount() {
        amnt = Integer.parseInt(c.readLine("Enter the sales amount: "));
    }

    void x_area() {
        if (amnt < 1000)
            System.out.println(amnt * 10 / 100);

        else if (amnt >= 1000 && amnt < 5000)
            System.out.println(amnt * 12 / 100);

        else if (amnt >= 5000)
            System.out.println(amnt * 15 / 100);
    }

    void y_area() {
        if (amnt < 1500)
            System.out.println(amnt * 10 / 100);

        else if (amnt >= 1500 && amnt < 7000)
            System.out.println(amnt * 12 / 100);

        else if (amnt >= 7000)
            System.out.println(amnt * 15 / 100);
    }

    void z_area() {
        if (amnt < 1200)
            System.out.println(amnt * 10 / 100);

        else if (amnt >= 1200 && amnt < 6500)
            System.out.println(amnt * 12 / 100);

        else if (amnt >= 6500)
            System.out.println(amnt * 15 / 100);
    }

    public static void main(String args[]) {
        String s;
        // create class object
        String area;
        Q5 ob = new Q5();
        ob.get_amount();
<<<<<<< HEAD:Assignment_Questions/Assignment_6/Q5.java
        area = c.readLine("enter the area: ");

        switch (area) {
            case "x":
                System.out.print("Commission of area x: ");
                ob.x_area();
                break;
            case "y":
                System.out.print("Commission of area y: ");
=======
        s = c.readLine("Enter the Area for Commission: ");
        System.out.print("Commission is= ");
        switch (s) {
            case "x":
                ob.x_area();
                break;

            case "y":
>>>>>>> d65a8e060dd9c9425d1a7b08ce5af197405f03c1:Java_Questions/Assignment_6/Q5.java
                ob.y_area();
                break;

            case "z":
<<<<<<< HEAD:Assignment_Questions/Assignment_6/Q5.java
                System.out.print("Commission of area z: ");
=======
>>>>>>> d65a8e060dd9c9425d1a7b08ce5af197405f03c1:Java_Questions/Assignment_6/Q5.java
                ob.z_area();
                break;

            default:
<<<<<<< HEAD:Assignment_Questions/Assignment_6/Q5.java
                System.out.println("Enter the right area!");
=======
                System.out.println("Enter the right Area!");
                break;
>>>>>>> d65a8e060dd9c9425d1a7b08ce5af197405f03c1:Java_Questions/Assignment_6/Q5.java

        }

    }
}
