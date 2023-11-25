import java.io.*;

public class writing {
    public static void main(String[] args) {
        try {
            FileWriter writing = new FileWriter("AB3.txt");
            writing.write("Hello, I'm Javed akhtar from mirzapur!");
            writing.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}