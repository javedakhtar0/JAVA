
//copy the content of oone file to another file
import java.io.*;

class copy {
    public static void main(String args[]) {

        try {
            FileReader fr = new FileReader("Ab1.txt");
            FileWriter fr1 = new FileWriter("data1.txt");

            int i;
            while ((i = fr.read()) != -1) {
                fr1.write((char) i);
            }
            System.out.println("File created");
            fr.close();
            fr1.close();
        } catch (IOException e) {
            System.out.println("IO Exceptins");
        }
    }
}