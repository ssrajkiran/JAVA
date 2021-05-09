import java.util.Scanner;
public class Details extends Mark{
    public Scanner input = new Scanner(System.in);
    
        public void getdetail(){
            System.out.println("Enter the student name:");
            String name = input.nextLine();
            
            System.out.println("Enter the student age:");
            int age = input.nextInt();

            System.out.println("Student id:");
            int id = input.nextInt();

            outdetail(name,age,id);
        }
        

        public void outdetail(String a,int b,int c){
            for(int i =0;i<=20;i++){
                System.out.print("*");
            }System.out.println();
            System.out.println("Student name :"+a);
            System.out.println("Student age :"+b);
            System.out.println("Student id :"+c);

        }




}