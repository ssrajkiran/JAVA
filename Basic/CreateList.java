import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateList {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("C");
        listA.add("C++");
        listA.add("HTML");
        listA.add("JAVA");
        listA.add("PYTHON");
        System.out.println(listA);
    }
}