import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File objTestRead = new File("test.txt"); // declare object for file
            Scanner myReader = new Scanner(objTestRead); //scan line by line or in  other words read
            while (myReader.hasNextLine()) { // in order to read the whole paragraph , we need to use while loop, hasNextLine is a function use to read the next following line
                String text = myReader.nextLine(); // convert the text to string using variables called "text"
                System.out.println(text); // print the file
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}