class rectangle {
    int length, breadth;

    public rectangle() // default constructor
    {
        length = 12;
        breadth = 5;
    }

    public rectangle(int x, int y) // parameterised constructor
    {
        length = x;
        breadth = y;
    }

    int recArea() // Simple method for calculating rectangle area
    {
        return (length * breadth);
    }
}

public class constructor {
    public static void main(String args[]) {
        rectangle r1 = new rectangle(); // calling default constructor method
        rectangle r2 = new rectangle(15, 7); // calling parameterised constructor
        System.out.println("Area:" + r1.recArea());
        System.out.println("Area:" + r2.recArea());
    }
}
