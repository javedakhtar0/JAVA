//decleration of constructor 
class Cons
{
    Cons()      //creation of constructor
    {
        System.out.println("Constructor called");
    }

    public static  void main(String args[])
    {
        Cons ob=new Cons();  //ob is a object of the class Cons which will be automatically called
        ob.Name();
    }

    void Name()
    {
        System.out.println("javed");
    }
}