//2. Java Exception Handling using finally block
//In Java, the finally block is always executed no matter whether there is an exception or not.

class FinallyBlock {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}