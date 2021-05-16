import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bdconnect { 
    public static Scanner input = new Scanner(System.in);
    private static Connection con;
    private static Statement st;
    

    public static void main(String[] args)throws SQLException {
            System.out.println("Enter name :");
            String name = input.nextLine();

        System.out.println("Enter age :");
            int age = input.nextInt();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
            st = con.createStatement();

            String e ="insert into customer values('"+name+"','"+age+"');";
            System.out.println("Inserted successfully");
            st.executeUpdate(e);    

        } catch (InputMismatchException e) {
            System.out.println("Error");
        } catch (ClassNotFoundException a) {
           a.printStackTrace();
        }
    }
}