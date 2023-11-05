//decleration of constructor and Method(function)
class Cons2
{
    Cons2()      //creation of constructor
    {
        System.out.println("Constructor called");
        Name();
    }

    public static  void main(String args[])
    {
         //ob is a object of the class Cons which will be automatically called
        Cons2 ob=new Cons2(); 
       
    }

   public static void Name()
    {
      System.out.println("javed");
    }
}