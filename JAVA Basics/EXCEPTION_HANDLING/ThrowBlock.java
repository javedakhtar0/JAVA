//Exception handling using Java throw
//The Java throw keyword is used to explicitly throw a single exception.

class ThrowBlock {
    public static void divideByZero() {

        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}