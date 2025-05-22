import java.io.*;

class deleting {
    public static void main(String args[]) {

        File delete = new File("AB3.txt");
        if (delete.delete()) {
            System.out.println("Deleted the file: " + delete.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}