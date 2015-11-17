package ro.marius.MySQL_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppProduse {

	 public static void main( String[] args )
	    {
	    	
	    	try{
	    		String mesaj = null;
	    		System.out.println(mesaj.length());
	    	}catch(Exception e){
	    	}
	        
	        try{
	        	Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/nitas_application", "root", "");
	        	Statement stmt = conexiune.createStatement();
	        	String sql = "SELECT * FROM product";
	        	ResultSet rs = stmt.executeQuery(sql);
	        	while(rs.next()){
	        		System.out.println(rs.getString("product_description"));
	        	}
	        	conexiune.close();
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
	        
	    }

}
