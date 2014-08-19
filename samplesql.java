import java.sql.*;
import java.util.Properties;

public class samplesql
{
  // The JDBC Connector Class.
  private static final String dbClassName = "com.mysql.jdbc.Driver";

  // Connection string. emotherearth is the database the program
  // is connecting to. You can include user and password after this
  // by adding (say) ?user=paulr&password=paulr. Not recommended!

  private static final String CONNECTION =
                          "jdbc:mysql://localhost/sayantan";

  public static void main(String[] args) throws
                             ClassNotFoundException,SQLException
  {
    System.out.println(dbClassName);
   
    Class.forName(dbClassName);

    Properties p = new Properties();
    p.put("user","srikanth");
    p.put("password","123");

    Connection c = DriverManager.getConnection(CONNECTION,p);

	String query = "SELECT * FROM emp_tab WHERE emp_id=1";
	Statement statement = c.createStatement();
       ResultSet      rs = statement.executeQuery(query);
System.out.println(rs);

    System.out.println("It works !");
    c.close();
    }
}
