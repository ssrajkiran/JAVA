import java.io.File;
import java.io.*;
public class FileCreate {
    public static void main(String[] args) {
        File file = new File("Filename\\Filepath");
        boolean present = file.exists();
        String fileName = "FileName" + "Extension";
        
        File newFile = new File(fileName);
        if (present == true) {
            System.out.println(present);
        } else {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                // TODO Autoja-generated catch block
                e.printStackTrace();
            }
        }

    }
}