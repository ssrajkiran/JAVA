import java.util.Scanner;
import java.util.InputMismatchException;
public class Details extends Mark {
    public Scanner input = new Scanner(System.in);

    public void getdetail() {
        
        System.out.println("Enter the student name:");
        String name = input.nextLine();

        int age = getage();
        int id = getid();

        outdetail(name, age, id);
    }

    public int getage() {
        int age = 0;
        boolean a = true;
        while (a) {
            try {
                System.out.println("Enter the age:");
                age = input.nextInt();
                a = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
                input.next();
            }
        }
        return age;
    }

    public int getid() {

        int id = 0;
        boolean a = true;
        while (a) {
            try {
                System.out.println("Enter the id:");
                id = input.nextInt();
                a = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
                input.next();
            }
        }
        return id;
    }

    public void outdetail(String a, int b, int c) {
        for (int i = 0; i <= 20; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Student name :" + a);
        System.out.println("Student age :" + b);
        System.out.println("Student id :" + c);
    }

}