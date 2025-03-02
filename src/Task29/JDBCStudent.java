package Task29;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStudent {

	private static final String URL = "jdbc:mysql://localhost:3306/school";
	private static final String USER ="root";
	private static final String PASSWORD ="root";
	
	public static void insertStudent(Connection conn,String name, int age,String grade) throws SQLException{
		String query = "INSERT INTO students(name,age,grade) VALUES(?,?,?)";
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, grade);
			stmt.executeUpdate();
			System.out.println("Student added successfully");
			
		} 
	}
	
	public static void updateStudent(Connection conn, int id,String newGrade) throws SQLException{
		String query = "Update students SET grade = ? where id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, newGrade);
			stmt.setInt(2, id);
			int rowsAffected =  stmt.executeUpdate();
			if(rowsAffected>0) {
				
				System.out.println("Student Updated successfully");
			}
			else {
				System.out.println("No Sudent found with id ="  + id);
			}
			
		}
	}
	
	public static void retrieveStudent(Connection conn) throws SQLException{
		String query = "Select * from students";
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			System.out.println("Student records :");
			
			while (rs.next()) {System.out.println("ID : " +rs.getInt("id")+",Name "+rs.getString("name") +",Age :"+rs.getInt("age")+",Grade :"+rs.getString("grade"));
			}
			
		}}
	
	public static void deleteStudent(Connection conn, int id) throws SQLException{
		String query = "Delete from  students where id =?";
		try(PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, id);
			int rowsAffected =  stmt.executeUpdate();
			if(rowsAffected>0) {
				
				System.out.println("Studend deleted successfully");
			}
			else {
				System.out.println("No Sudent found with id ="  + id);
			}
			
		}
	}
	
	public static void callStoredProcedure(Connection conn) throws SQLException{
		String procedureCall = "{CALL GetEmployeeDetails()}";
		try(CallableStatement stmt = conn.prepareCall(procedureCall);
				ResultSet rs = stmt.executeQuery()){
			System.out.println("Employee Details  :");
			
			while (rs.next()) {System.out.println("ID : " +rs.getInt("id")+",Name "+rs.getString("name") +",Department :"+rs.getString("Department"));
			}
			
		}}
	
	
	
	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(URL,USER,PASSWORD)){
			System.out.println("Connected to mysql database");
			
			insertStudent(conn,"Rohit kumar",20,"A");
			updateStudent(conn, 1, "A+");
			retrieveStudent(conn);
			deleteStudent(conn,2);
			retrieveStudent(conn);
			
			callStoredProcedure(conn);
		}
	
		catch (Exception e) {
			
		}
			
		
		
		}	
	
}
