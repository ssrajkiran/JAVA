import java.io.*;
public class FileCreate {
    public static void main(String[] args) throws IOException {

        String fname = "File path";
        File f = new File(fname);

        if (f.exists()) {
            System.out.println("File exists");
            return;
        }

        try (FileWriter fw = new FileWriter(f)) {
            fw.write("");
        }

    }
}