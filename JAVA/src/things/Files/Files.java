package things.Files;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

class write {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("name.txt");
            file.write("S\no\nm\ne\n \nr\na\nn\nd\no\nm\n \nt\ne\nx\nt\n");
            file.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Error time");
            e.printStackTrace();
        }
    }
}
