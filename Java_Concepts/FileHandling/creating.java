import java.io.*;

public class creating {
    public static void main(String[] args) {
        try {
            File creat = new File("AB2.txt");
            if (creat.createNewFile()) {
                System.out.println("File created: " + creat.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}