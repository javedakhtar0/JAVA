
import java.io.*;

public class SalesRecord {
    String name, month;
    int year, amount;

    void getData() {
        Console c = System.console();
        name = c.readLine("Enter the name : ");
        month = c.readLine("Enter the Name : ");
        year = Integer.parseInt(c.readLine("Enter the yearment : "));
        amount = Integer.parseInt(c.readLine("Enter the Salry : "));
    }

    void showData() {
        System.out.println(name);
        System.out.println(month);
        System.out.println(year);
        System.out.println(amount);
    }

    public static void main(String args[]) {
        Employee ob1[] = new Employee[5];
        System.out.println("Enter the 10 sales Records");
        for (int i = 0; i < 5; i++) {
            ob1[i] = new Employee();
            ob1[i].getData();
        }

        System.out.println("Sales Records in Decending Order of year");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (ob1[j].year < ob1[j + 1].year) {
                    SalesRecord temp = ob1[j];
                }
            }
            ob1[i].showData();
        }
    }
}
