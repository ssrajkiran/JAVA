import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    static Scanner input = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {
        final String filename = "Filename";
        final Path path = Paths.get(filename);
        System.out.println("Read the file: 1.Bytes 2.List");
        int n = input.nextInt();
        if (n == 1) {
            String content = new String(Files.readAllBytes(path));
            System.out.println(content);
        } else {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            System.out.println(lines);
        }
    }
}