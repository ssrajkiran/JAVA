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

  public void getDetails() {
    System.out.println("Enter your name:");
    name = input.nextLine();
    System.out.println("Enter your id:");
    id = input.nextInt();
  }

  public void PrintMarks() {
    System.out.println(String.format("name : %s id : %s", name, id));
    System.out.println("*** Marks ***");
    for (int i : marks) {
      System.out.println("" + i);
    }
  }

}