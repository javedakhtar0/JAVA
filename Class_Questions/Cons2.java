//decleration of constructor and Method(function)
class Cons2
{
    Cons2()      //creation of constructor
    {
        System.out.println("Constructor called");
    }

    public static  void main(String args[])
    {
        Cons2 ob=new Cons2();  //ob is a object of the class Cons which will be automatically called
        Name();
    }

   public static void Name()
    {
      System.out.println("javed");
    }
}