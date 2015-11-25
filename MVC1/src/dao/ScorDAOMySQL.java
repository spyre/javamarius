package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Scor;

public class ScorDAOMySQL implements IDAOScoruri{

	public List<Scor> findAllScoruri(){ // select * from scoruri
		
		List<Scor>scoruri = new ArrayList<>();
		
		
		try{
			Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/joc", "root", "");
			Statement stmt = conexiune.createStatement();
			
			ResultSet rezultate = stmt.executeQuery("SELECT * FROM scoruri");
			while(rezultate.next()){
				
				Scor scorDinBD = new Scor(rezultate.getString("nume_jucator"), rezultate.getInt("scor"));
				scoruri.add(scorDinBD);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		return scoruri;
	}
}
