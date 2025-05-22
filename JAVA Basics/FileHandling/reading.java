import java.io.*;

class reading {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("Ab3.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("I/O problem");
        }
    }
}