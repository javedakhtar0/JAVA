//decleration of constructor and Method(function)
class Cons3
{
    Cons3()      //creation of constructor
    {
        System.out.println("Constructor called");
        Name();     //method called in constructor
    }

    public static  void main(String args[])
    {
        Cons3 ob=new Cons3();  //ob is a object of the class Cons which will be automatically called
       
    }

    void Name()         //method (function)
    {
      System.out.println("javed");
    }
}