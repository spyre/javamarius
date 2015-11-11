package ro.marius.MySQL_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	try{
    		String mesaj = null;
    		System.out.println(mesaj.length());
    	}catch(Exception e){
    		System.out.println("OPA");
    	}
        
        try{
        	Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
        	Statement stmt = conexiune.createStatement();
        	String sql = "select * from actor";
        	ResultSet rs = stmt.executeQuery(sql);
        	while(rs.next()){
        		System.out.println(rs.getString("first_name"));
        	}
        	conexiune.close();
        }catch(Exception e){
        	e.printStackTrace();
        }
        
    }
}
