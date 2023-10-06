import java.io.*;

class Q8 {
    public static void main(String args[]) {
        Console c = System.console();

        // declairation of variables
        int num1, num2, num3, num4;

        // read data from the user
        num1 = Integer.parseInt(c.readLine("Enter the num1:"));
        num2 = Integer.parseInt(c.readLine("Enter the num2:"));
        num3 = Integer.parseInt(c.readLine("Enter the num3:"));
        num4 = Integer.parseInt(c.readLine("Enter the num4:"));

        // check the greatest number
        int greatest = num1;
        if (num2 > greatest)
            greatest = num2;
        if (num3 > greatest)
            greatest = num3;
        if (num4 > greatest)
            greatest = num4;
        System.out.println("Greatest number is: " + greatest);

        // check the smallest number
         int smallest = num1;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;
        if (num4 < smallest)
            smallest = num4;
        System.out.println("smallest number is: " + smallest);

        //find the diffrence b/w greatest and smallest number
        int dif=greatest-smallest;
        System.out.println("Diffrence b/w greatest and smallest number is: "+dif);

    }

}
