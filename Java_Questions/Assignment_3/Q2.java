import java.io.Console;

//Display the a company product basic information

class Q2 {
    public static void main(String args[]) {
        Console c = System.console();
        
        // read informations
        String s = c.readLine("Enter The Product Name:");
        String s1 = c.readLine("Enter The Manufacturer Name:");
        int p = Integer.parseInt(c.readLine("Enter The Price:"));
        System.out.println("Basic Details of a Product: ");

        // print all information
        System.out.println("Product_name: " + s);
        System.out.println("Manufacturer_name: " + s1);
        System.out.println("Price: " + p);
    }
}