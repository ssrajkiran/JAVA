import java.io.*;

public class Patterntwo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j =0; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}