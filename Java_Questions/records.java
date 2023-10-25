import java.io.*;
class records{
    public static void main(String args[])
    {
        Console c= System.console();
        String name,month;
        int year,amount;
        
        void getdata()
        {
            name=c.readLine("Enter the salesMan_name: ");
            month=c.readLine("Enter the Month_name: ");
            year=Integer.parseInt(c.readLine("Enter the year: "));
            amount=Integer.parseInt(c.readLine("Enter the SAles_Amount: "));
        }
    }
}