import java.util.*;

public class Size
{

    public static void Sizeof()
    {
        System.out.println("Size of byte:" +Byte.SIZE/8);
        System.out.println("Size of Interger:" +Integer.SIZE/8);
         System.out.println("Size of Character:" +Character.SIZE/8);
          System.out.println("Size of Float:" +Float.SIZE/8);
           System.out.println("Size of Double:" +Double.SIZE/8);
            System.out.println("Size of Long:" +Long.SIZE/8);
             System.out.println("Size of Short:" +Short.SIZE/8);
    }
    public static void main(String[] args)
    {
    Sizeof();
    }
}