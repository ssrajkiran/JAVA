import java.util.Scanner;
public class Eb_bill{
    public static Scanner input = new Scanner(System.in);
    public static Double unit = 0.0;
    public static Double total = 0.0;
    
    public static void main(String [] args){
        boolean a =true;
        while(a){
        System.out.println("Enter the unit");
        if(input.hasNextDouble()){
        unit = input.nextDouble();
        }
        else{
        System.out.println("Error ! Re Enter :");
        input.next();
        unit = input.nextDouble();
        }
        a=false;
        }

        if (unit > 0 && unit <= 100) {
           
            total = 0.0;
        } else if (unit <= 200) {
            total =((unit - 100) * 1.5)+20;
          
        } else if (unit <= 500) {
            total =(100 * 2) + (unit - 200) * 3 +30;
         
        } else if (unit > 500) {
            total =(100 * 3.5) + (300 * 4.6) + (unit - 500) * 6.6+50;
           
        }
        System.out.println(total);
        }



    }
