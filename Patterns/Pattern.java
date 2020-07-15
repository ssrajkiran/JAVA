import java.util.Scanner;

class Pattern {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the no of times to flow(Pattern one):");
        int n = input.nextInt();
        for (int i = 0; i < +n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}