import java.util.*;

public class Midnum {
    static Scanner input = new Scanner(System.in);     
    public static void main(final String[] args) {
        String str = input.nextLine();
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        System.out.println(str.substring(position, position + length));
 
    }    
}