import java.io.*;

public class Employee {
    String id, name, depart;
    int salary;

    void getData() {
        Console c = System.console();
        id = c.readLine("Enter the id : ");
        name = c.readLine("Enter the Name : ");
        depart = c.readLine("Enter the Department : ");
        salary = Integer.parseInt(c.readLine("Enter the Salry : "));
    }

    void showData() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(depart);
        System.out.println(salary);
    }

    public static void main(String args[]) {
        Employee ob1[] = new Employee[5];
        System.out.println("Enter the detailes of Employee");
        for (int i = 1; i <= 5; i++) {
            ob1[i] = new Employee();
            ob1[i].getData();
        }

        System.out.println("Information about those imployee whose Salary is above 10,000");
        for (int i = 0; i <=5; i++) {
            if (ob1[i].salary > 10000)
                ob1[i].showData();
        }
    }
}
