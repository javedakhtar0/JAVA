class Q3{
    Q3()        //decraition of default constructor which is called automatically when object created
    {
        System.out.println("This is a default constructor!");
    }

    //this constructor display the name and rollNo.
    Q3(String name,int roll)
    {
        System.out.println("Name: " +name);
        System.out.println("RollNo: " +roll);
    }

    public static void main(String args[])

    {
        Q3 ob=new Q3();
        Q3 ob2=new Q3("javed",65);
        
    }


}