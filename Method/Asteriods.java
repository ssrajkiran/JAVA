import java.util.*;

public class Asteriods {
    static Scanner input = new Scanner(System.in);
    public static int n;

    static void diagram() {
        int sum=1;
        for (int r = 1; r <= n; r++) 
        {
          for(int s= 1;s<=r;s++)
          {
              System.out.print(sum);
              sum++;

          }
          System.out.println();
        }
    }

    public static void main(final String[] args) {
        System.out.println("Enter no of times:");
        n = input.nextInt();
        diagram();
    }
}