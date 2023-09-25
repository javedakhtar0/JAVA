/*this program give output af salesman's commission according to area
 * there are three area like x,y and z.
 * first of all we get the sales amount from the user by the help of get_amount method
 * after getting sales amount display salesman commission on the bassis of his area
 */

import java.io.Console;

public class Q5 {

    int amnt, comsn;
    static Console c = System.console();

    void get_amount() {
        amnt = Integer.parseInt(c.readLine("Enter the sales amount: "));
    }

    void x_area() {
        if (amnt < 1000)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1000 && amnt < 5000)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 5000)
            System.out.println(amnt * 15 / 100);
    }

    void y_area() {
        if (amnt < 1500)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1500 && amnt < 7000)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 7000)
            System.out.println(amnt * 15 / 100);
    }

    void z_area() {
        if (amnt < 1200)
            System.out.println(amnt * 10 / 100);

        if (amnt >= 1200 && amnt < 6500)
            System.out.println(amnt * 12 / 100);

        if (amnt >= 6500)
            System.out.println(amnt * 15 / 100);
    }

    public static void main(String args[]) {
        // create class object
        String area;
        Q5 ob = new Q5();
        ob.get_amount();
        area = c.readLine("enter the area: ");

        switch (area) {
            case "x":
                System.out.print("Commission of area x: ");
                ob.x_area();
                break;
            case "y":
                System.out.print("Commission of area y: ");
                ob.y_area();
                break;

            case "z":
                System.out.print("Commission of area z: ");
                ob.z_area();
                break;

            default:
                System.out.println("Enter the right area!");

        }

    }
}
