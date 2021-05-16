import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;


public class student {
    public static Scanner input = new Scanner(System.in);
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    public static String name;
    public static int id;
    public static int mark[] = new int[5];
    public static int sum = 0;
    public static boolean n = true;

    public static void main(String[] args) throws SQLException {

        
        
        while (n) {
            try {
                System.out.println("Enter student name :");
                if(input.hasNextInt()){
                    System.out.println("Enter valid name :");
                    input.next();
                    name = input.next();
                }else
                {
                    name = input.next();
                }


                System.out.println("Enter student id :");
                if(input.hasNextInt()){
                    id = input.nextInt();
                }else{
                    System.out.println("Enter valid id:");
                    input.next();
                    id=input.nextInt();
                }
                 System.out.println("Enter student mark of 5 subject :");

                 for (int i = 0; i < 5; i++) {
                    if (input.hasNextInt()) {
                        mark[i] = input.nextInt();
                        sum = sum +mark[i];
                    }
                    else{
                        System.out.println("Enter valid marks");
                        input.next();
                        mark[i]=input.nextInt();
                        sum = sum+mark[i];
                    }
                }
                n = false;

            } catch (InputMismatchException f) {
                System.out.println("Error");
            }
            
        }
        System.out.println(sum);
        int average = sum / 5;
        dbconnect(name, id, mark, average);
    }

    public static void dbconnect(String name, int id, int[] mark, int average) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "1234");
            st = con.createStatement();
            String q = "insert into Record values('" + name + "','" + id + "','" + mark[0] + "','" + mark[1] + "','"
                    + mark[2] + "','" + mark[3] + "','" + mark[4] + "','" + average + "');";
            System.out.println(q);
            st.executeUpdate(q);

            String q1 = "select name,id,Tamil,English,Maths,Science,Social,Average from record;";
            rs = st.executeQuery(q1);
            System.out.println("NAME\t\tID\t\tTAMIL\t\tENGLISH\t\tMATHS\t\tSCIENCE\t\tSOCIAL\t\tAVERAGE");
            while (rs.next()) {
                System.out.print(rs.getString("Name") + "\t\t");
                System.out.print(rs.getInt("Id") + "\t\t");
                System.out.print(rs.getInt("Tamil") + "\t\t");
                System.out.print(rs.getInt("English") + "\t\t");
                System.out.print(rs.getInt("Maths") + "\t\t");
                System.out.print(rs.getInt("Science") + "\t\t");
                System.out.print(rs.getInt("Social") + "\t\t");
                System.out.print(rs.getInt("Average") + "\t\t");
                System.out.println();
            }
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException r) {
            r.printStackTrace();
        }

    }
}
