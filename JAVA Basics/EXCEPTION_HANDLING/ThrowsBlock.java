//Exception handling using Java throws.
// the throws keyword is used to declare the type of exceptions that might occur within the method. It is used in the method declaration.

import java.io.*;

class ThrowsBlock {
    // declareing the type of exception
    public static void findFile() throws IOException {

        // code that may generate IOException
        File newFile = new File("TryCatch.java");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}