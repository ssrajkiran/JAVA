import java.util.*;

class AreaRect extends result {
        public static void main(String [] args)
    {
    result ob1 = new result();
    ob1.setresult();
    ob1.getresult();
    
    }
}

class result{
     
    static Scanner input = new Scanner (System.in);
    private int num1;
    private int num2;

    

    
    public void setresult() {
        System.out.println("Area of square and rectangle:");
        System.out.println("Enter the number:");
        num1 = input.nextInt();
        System.out.println("Enter the number:");
        num2 = input.nextInt();
    }

    public void getresult() {
        
        System.out.println("Area of square:" + num1 * num1);
        System.out.println("Area of rectangle:" +num1* num2);
        

        while (num1 != num2) {
            System.out.println("Its rectangle");
            break;
        }
        for (; num1 == num2;) {
            System.out.println("Its square");
            break;
        }
    }

}
