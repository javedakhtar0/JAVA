class Q2{
    //this constructor give the addition of two numbers
    Q2(int num1 ,int num2)
    {
        System.out.println("Addition of to number is: "+(num1+num2));
    }

    //this constructor display the full name
    Q2(String ch1,String ch2)
    {
        System.out.println("Your full name is: "+(ch1+ch2));
    }

    //this constructor display the name and rollNo.
    Q2(String name,int roll)
    {
        System.out.println("Name: " +name);
        System.out.println("RollNo: " +roll);
    }

    public static void main(String args[])
    {
        Q2 ob=new Q2(10,5);
        Q2 ob1=new Q2("javed"," akhtar");
        Q2 ob2=new Q2("javed",65);
        
    }


}