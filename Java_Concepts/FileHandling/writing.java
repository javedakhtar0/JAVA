import java.io.*;

public class writing {
    public static void main(String[] args) {
        try {
            FileWriter writing = new FileWriter("AB2.txt");
            writing.write("Files in Java might be tricky, but it is fun enough!");
            writing.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}