
/* in this code we use the interface and do the calculation of shapes like squre,rectangle etc. */

import java.io.Console;

interface shape { // interface
    void area(); // interface method (does not have a body)

    void accept();

    void perimeter();
}

// square "implements" the shpe interface
class square implements shape {
    int s;

    public void accept() {
        Console c = System.console();
        s = Integer.parseInt(c.readLine("Enter the side of square: "));
    }

    public void area() {
        System.out.println("Area of Square: " + (s * s));
    }

    public void perimeter() {
        System.out.println("Perimeter of Square: " + (4 * s));
    }
}

// rectangle "implements" the shpe interface
class rectangle implements shape {
    int l, w;

    public void accept() {
        Console c = System.console();
        l = Integer.parseInt(c.readLine("Enter the length of rectangle: "));
        w = Integer.parseInt(c.readLine("Enter the width of rectangle: "));

    }

    public void area() {
        System.out.println("Area of rectangle: " + (l * w));
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle: " + 2 * (l + w));
    }

}

public class B {

    public static void main(String args[]) {
        square a1 = new square(); // Create a object of class square
        rectangle b1 = new rectangle(); // Create a object of class rectangle rectangle 
        a1.accept();
        a1.area();
        a1.perimeter();
        b1.accept();
        b1.area();
        b1.perimeter();

    }
}