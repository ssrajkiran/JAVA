import java.util.Scanner;

public class CheckVowels {
    static Scanner input = new Scanner(System.in);

        static void check(String str,int a,int b)
        {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is vowel");
                    a++;
                } else {
                    System.out.println(ch + " is consonant");
                    b++;
                }
            }
            System.out.println("Total Vowels:" + a);
            System.out.println("Total Consonant:" + b);
        }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("Enter any single word/character");
        String str = input.next();
        check(str,a,b);

        

    }
}