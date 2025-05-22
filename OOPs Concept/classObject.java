
// Use of Object and Classes in Java

public class classObject {
    // Properties of variables
    private int a;
    private int b;

    // Setter methods
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Methods for calculation
    public void sum() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

     public void mul() {
        System.out.println(a * b);
    }

     public void div() {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        classObject obj = new classObject();

        // Using setters instead of direct access
        obj.setA(55);
        obj.setB(5);

        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
