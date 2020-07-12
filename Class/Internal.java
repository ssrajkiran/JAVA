import java.util.*;

public class Internal {
  private Scanner input;
  private String name;
  private int id;
  private int[] marks;

  public Internal() {
    input = new Scanner(System.in);
    marks = new int[5];
  }

  public void getDetails() {
    System.out.println("Enter your name:");
    name = input.nextLine();
    System.out.println("Enter your id:");
    id = input.nextInt();
  }

  public void getMarks() {
    System.out.println("Enter marks for Tamil:");
    marks[0] = input.nextInt();
    System.out.println("Enter marks for English:");
    marks[1] = input.nextInt();
    System.out.println("Enter marks for Maths:");
    marks[2] = input.nextInt();
    System.out.println("Enter marks for Science:");
    marks[3] = input.nextInt();
    System.out.println("Enter marks for Social:");
    marks[4] = input.nextInt();

  }

  public void getgrade() {
    int k = 1;
    while (k <= 21) { System.out.print("*"); k++; }
    System.out.println();

    System.out.println("***Details***");
    System.out.println(String.format("name : %s id : %s", name, id));
    System.out.println("*** Marks ***");
    for (int i : marks) {
      if (i > 90 && i <= 100) {
        System.out.println("Marks of subjects:" + i + " " + "Grade : A");
      } else if (i > 80 && i < 90) {
        System.out.println("Mark of subjects:" + i + " " + "Grade : B ");
      } else if (i > 70 && i < 80) {
        System.out.println("Mark of subjects:" + i + " " + "Grade : C");
      } else if (i > 60 && i < 70) {
        System.out.println("Mark of subjects:" + i + " " + "Grade : D");
      } else if (i > 50 && i < 60) {
        System.out.println("Mark of subjects:" + i + " " + "Grade : E");
      } else {
        System.out.println("Mark of subjects:" + i + " " + "Grade : F");
      }
    }
    int e = 1;
    while (e <= 20) {
      System.out.print("*");
      e++;
    }
    System.out.println();
  }

}