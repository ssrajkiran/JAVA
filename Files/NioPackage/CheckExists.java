import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckExists {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String adString = "Filepath";
        Path path = Paths.get(adString);
        if (Files.exists(path)) {
            System.out.println("Already exists");
         return;
                     
        } else {
            System.out.println("Your directory is not available.");
            System.out.println("1.To Create 2.Exit");
            int n = input.nextInt();
            if (n == 1) {
                Files.createDirectory(path);
                System.out.println("Your directory is created.");
            } else {
                return;
            }
        }
    }
}