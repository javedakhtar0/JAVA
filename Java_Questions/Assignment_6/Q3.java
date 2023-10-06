import java.io.Console;
class Q3 {
    Console c=System.console();
    double unit;
    void get_unit()
    {
        unit=Integer.parseInt(c.readLine("Enter the Cunsumption unit: "));
    }

    void Display_charge()
    {
        if(unit<=200)
        {
            System.out.println("Charges is= "+(unit*0.50));
        }
        else if(unit>=201 && unit<=400)
        {
            System.out.println("Charges is= "+(((unit-200)*0.65)+100));
        }

         else if(unit>=401 && unit<=600)
        {
            System.out.println("Charges is= "+(((unit-400)*0.80)+230));
        }

         else if(unit>600)
        {
            System.out.println("Charges is= "+(((unit-600)*1.25)+425));
        }
    }

    public static void main(String args[])
    {
        Q3 ob=new Q3();
        ob.get_unit();
        ob.Display_charge();
    }
}
