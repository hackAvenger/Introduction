package JDBC;

import java.sql.*;

public class JdbcConnection {
  
  public static void main(String[] agr) throws ClassNotFoundException, SQLException {
    {
      String url = "jdbc:mysql://localhost:3306/credable";
      String username = "root";
      String password = "credable";
      String query = "select * from buyer where id=276";
      Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
      Connection con = DriverManager.getConnection(url, username, password);
      System.out.println("Connection Established successfully");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      rs.next();
      String name = rs.getString("name");
      System.out.println(name);
      st.close(); // close statement
      con.close(); // close connection
      System.out.println("Connection Closed....");
    }
  }
}
