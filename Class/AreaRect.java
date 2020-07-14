import java.util.*;

public class AreaRect {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Area of square and rectangle:");
            System.out.println("Enter the number:");
            num1 = sc.nextInt();
            System.out.println("Enter the number:");
            num2 = sc.nextInt();
        }

        Shapes shape;
        if (num1 == num2) {
            shape = new Square();
        } else {
            shape = new Rectangle();
        }

        System.out
                .println(String.format("Selected shape is %s Area is %s", shape.getClass(), shape.getArea(num1, num2)));
    }

}

interface Shapes {
    int getArea(int a, int b);
    int getPerimeter(int a,int b);
}

class Square implements Shapes {

    @Override
    public int getArea(int a, int b) {
        return a * a;
    }

    @Override
    public int getPerimeter(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Rectangle implements Shapes {

    @Override
    public int getArea(int l, int b) {
        return l * b;
    }

    @Override
    public int getPerimeter(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Triangle implements Shapes {

    @Override
    public int getArea(int a, int b) {
        return 1 / 2 * a * b;
    }

    @Override
    public int getPerimeter(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

}
