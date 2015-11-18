package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtil {

	public static void saveUser(String username, String password){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginweb", "root", "");
			String instructiune = "INSERT INTO users(username, password) VALUES('"+username+"', '"+password+"')";
		
			// avem nevoie de Statement (stmt) de fiecare data cand facem ceva in BD 
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(instructiune); // executeUpdate -> INSERT, UPDATE, DELETE;;;; executeQuery -> SELECT
			
			
			System.out.println("Conexiune realizata");
		}catch(Exception e){
			System.out.println("PROBLEM");
			e.printStackTrace();
		}
	}
	
	
	
//	public static void main(String[] args) {
//		String un = "Bill";

//		saveUser("Bill", "9992");
//		
//	}
}
