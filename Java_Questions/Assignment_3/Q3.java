//Accept the record of an order and after that display aal information
import java.io.Console;
class Q3 {
    public static void main(String args[]) {
        Console c = System.console();
        
        // read informations
        String id = c.readLine("Enter The Product ID:");
        String p = c.readLine("Enter The Product Name:");
        int q = Integer.parseInt(c.readLine("Enter The Product Quantity:"));
        System.out.println("Basic Details of a Product: ");

        // print all information
        System.out.println("Product_ID: " + id);
        System.out.println("Manufacturer_name: " + p);
        System.out.println("Product_Quantity: " + q);
    }
}