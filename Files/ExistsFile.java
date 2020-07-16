import java.io.File;
public class ExistsFile
{
    public static void main(String[] args)
    {
        File file = new File("Filename");
        boolean present = file.exists();
        System.out.println(present);
    }
}
