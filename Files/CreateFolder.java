import java.io.*;
import java.util.*;

public class CreateFolder {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args)throws SecurityException{
        String path = "Filepath";
        System.out.println("Enter the file name want to check:");
        String name = input.nextLine();
        String foldername = path+name;
        File folder = new File(foldername);
        if (folder.exists()) {
            System.out.println("The folder already exists");
        } else {
            folder.mkdirs();
            if(folder.exists())
            {
                System.out.println("your folder is created.");
            }
        }
    }
}