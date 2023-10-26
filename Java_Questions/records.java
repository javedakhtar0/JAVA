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
        System.out.println("Those Employee Record whose salary above the 10000");
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(dep_name);
        System.out.println(emp_sal);
    }

    public static void main(String args[])
    {
        records d[]=new records(6);
       System.out.println("Enter the Employee Details:");
       for(int i=0;i<5;i++)
       {
            
       }
    }
}