import java.util.*;



public class Cal {

    public static void main(final String[] args) {
        int num1,num2,num3;
       try (Scanner input = new Scanner(System.in))
       {
           System.out.println("Enter first numbers:");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter option 1.Add :2.Subtract : 3.Multiplication : 4.Division");
        num3 = input.nextInt();
       }
       
        Operation operation;
           
           if(num3==1)
           { 
            operation = new Add();
           }
           else if (num3 ==2) 
           {
               operation = new Subtract();
           }
           else if (num3 ==3) {
               operation = new Multiplication();
           }
           else
           {
               operation = new Division();
           }
         System.out.println(String.format("%s is %d", operation.getClass() ,operation.calculator(num1,num2 )));   
        }
}

interface Operation {
    int calculator(int a, int b);
}

class Add implements Operation {
    @Override
    public int calculator(final int a,final int b) {
       
        return a+b;
    }
}
class Subtract implements Operation{
    public int calculator(final int a,final int b)
    {
        return a-b;
    }
}
class Multiplication implements Operation{
    public int calculator(final int a,final int b)
    {
        return a*b;
    }
}

class Division implements Operation{
    public int calculator(final int a,final int b)
    {
        return a/b;
        
    }
}

