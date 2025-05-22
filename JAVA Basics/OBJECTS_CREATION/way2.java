
// use of anonymous object (it is good for one time object use)

public class way2 { // main class

    String name = "javed akhtar";
    int a = 2;

    void way() {
        System.out.println(name);
        System.out.println(a);
    }

    public static void main(String args[]) // main driver method
    {
        // create object
        new way2().way();     //anonymous object 

    }

}
