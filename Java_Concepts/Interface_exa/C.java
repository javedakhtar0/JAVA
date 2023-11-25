
interface animal { // interface
    String name = "cat"; // string type variable of interface

    void m1(); // method of interface
}

class small implements animal { // imlementation of inteface animal by class small
    public void m1() {
        // display the message bellow given
        System.out.println("This is a small types animals");
    }
}

class big implements animal { // imlementation of inteface animal by class big
    public void m1() {
        // display the message bellow given
        System.out.println("This is a big types animals");
    }
}

abstract class C implements animal {

    public static void main(String args[]) // main method
    {
        small s = new small(); // creation of object by class small
        big b = new big(); // creation of object by class big
        s.m1(); // call the m1 by the object of class small
        b.m1(); // call the m1 by the object of class big

        //as u know we can access a static varibale directaly inside the static method
        System.out.println(name);

        //as we know that we can call a interface variable directly without creating any objecrts

    }
}