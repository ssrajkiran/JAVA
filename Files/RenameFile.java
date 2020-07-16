import java.util.*;

import java.io.File;

public class RenameFile {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String path = "";
        System.out.println("Enter the folder name to rename:");
        String name = input.nextLine();
        String foldername = path + name;
        File file = new File(foldername);

        if (!file.exists()) {
            System.out.println("Your folder name does not exists:");
            return;
        }

        System.out.println("Your folder exists");
        System.out.println("Give rename for the file");

        String newname = input.nextLine();
        String newFolderName = path + newname;
        File newfile = new File(newFolderName);
        file.renameTo(newfile);
        if (newfile.exists()) {
            System.out.println("Your folder renamed successfully");
            System.out.println("Your foldername is renamed to " + newfile.getName());
        } else {
            System.out.println("An error occurs");
        }
    }

}
