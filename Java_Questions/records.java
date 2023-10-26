import java.io.*;

class records {
    Console c = System.console();
    String emp_name, dep_name;
    int emp_id, emp_sal;

    void getdata() {
        emp_name = c.readLine("Name: ");
        dep_name = c.readLine("Department: ");
        emp_id = Integer.parseInt(c.readLine("id: "));
        emp_sal = Integer.parseInt(c.readLine("Salary: "));
    }

    void showdata() {
        System.out.println("ID : "+emp_id);
        System.out.println("Name : "+emp_name);
        System.out.println("Department : "+dep_name);
        System.out.println("Salary : "+emp_sal);
    }

    public static void main(String args[]) {
        records d[] = new records[6];
        System.out.println("Enter the Employee Details:");
        for (int i = 0; i < 5; i++) {
            d[i] = new records();
            d[i].getdata();
        }

        System.out.println("\n Those Employee Record whose salary above the 10000:");
        for (int i = 0; i < 5; i++) {

            if (d[i].emp_sal > 10000) {
                d[i].showdata();

            }

        }

    }
}