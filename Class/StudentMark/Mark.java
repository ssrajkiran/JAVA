import java.util.Scanner;
public class Mark
{
    public int no;
    public Scanner input = new Scanner(System.in);
    public void get(){

        System.out.println("Enter how many subject:");
        no = input.nextInt();
        int mark[] = new int[no];
        System.out.println("Enter the mark of "+no+"Subjects :");
        for (int i=0;i<no;i++){
        mark[i] = input.nextInt();
        }

        System.out.println("Your marks are :");

        for (int j=0;j<mark.length;j++){
        System.out.println("Mark of"+j+"subject :"+mark[j]);
        }
        total(mark);
    }
        public void total(int [] array)
        {
            int sum=0;
            for (int k=0;k<array.length;k++){
                sum+=array[k];
            }
           System.out.println("Total subject mark :"+sum); 
           average(sum,no);
        }


        public void average(int t, int no){
            int average =t/no;
            System.out.println("Your average mark:"+average);
        } 
        
    
}