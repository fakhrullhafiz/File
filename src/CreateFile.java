import java.io.File;
public class CreateFile{
    public static void main(String[] args){
        try {
            File objCreateFile = new File("test.txt");  //create object based on class imported from package
            if (objCreateFile.createNewFile()){ //create an if alse createNewFIle() is a method imported from the class
                System.out.println("file succesfully created"); //createNewFile() will return boolean values
                //true = succesfully create
            } else{
                System.out.println("file already existed");
                //false = file existed
            }

        } catch(Exception e) { //to catch a random error occured
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}