/*  in this progarm first off all we get input(marks) from the user by the get_marks()(method) and
 * after getting input check the marks for gradding in display_grade()(method) after checking print the 
 * grade of obtained marks in same display_grade()(method).
 */

import java.io.Console;

class Q2 {
    int marks;

    void get_marks() {
        Console c = System.console();
        marks = Integer.parseInt(c.readLine("Enter the Obtained Marks: "));
    }

    void display_grade() {
        if (marks >= 80 && marks <= 100)
            System.out.println("Honours");

        else if (marks >= 60 && marks <= 79)
            System.out.println("First Division");

        else if (marks >= 50 && marks <= 59)
            System.out.println("Second Division");

        else if (marks < 50)
            System.out.println("Fail");
    }

    public static void main(String args[]) {
        Q2 ob = new Q2();
        ob.get_marks();
        ob.display_grade();
    }
}
