//Basics code of interface that how to write and work the interface in java

interface face {        //This is a interface which name is face 
    int num = 20;       //in the interface by default each variable have public static and final variable.

    void m1();          //it's a method as u know that by default each method have public and abstract.

    void m2();
}

class A implements face {       //implements a interface in a class A
    public void m1() {
        System.out.println("m1() from A");
    }

    public void m2() {
        System.out.println("m2() from A");
    }

    public static void main(String args[]) {
        A ob1 = new A(); // Create a object of class A
        ob1.m1();  // call the method m1 by the object of class A
        ob1.m2();

        //As we know that we can call direct a Static variable in static method.
        //you saw the above inside the interface that each variable are static.
        System.out.println(ob1.num);
    }
}
