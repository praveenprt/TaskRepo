package Task28;

import java.sql.*;

public class DbConnection {
	
	public static void main(String[] args) {
		
	
	  String url = "jdbc:mysql://localhost:3306/mydb";
      String user = "root"; 
      String password = "root"; 

      try {
         
          Class.forName("com.mysql.cj.jdbc.Driver");

       
         Connection conn = DriverManager.getConnection(url, user, password);
          System.out.println("Connected to the database!");

         
        Statement
        stmt = conn.createStatement();

          
          String query = "SELECT * FROM register";
         ResultSet rs = stmt.executeQuery(query);
         
         while (rs.next()) {
          
             String name = rs.getString("name");
             String email = rs.getString("email");
          
             System.out.println( name + " | " + email );
         }
     
      } catch (Exception e) {
          System.out.println("Database connection error!");
          e.printStackTrace();
      }
      }
}
