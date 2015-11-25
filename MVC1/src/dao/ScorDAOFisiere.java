package dao;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.Scor;

public class ScorDAOFisiere  implements IDAOScoruri{

	
	public List<Scor> findAllScoruri(){
		
		List<Scor> scoruri = new ArrayList<>();
		
		try{
			FileReader fr = new FileReader("D:/scoruri.txt");
			BufferedReader br2 = new BufferedReader(fr);
			String linie = br2.readLine();
			while(linie != null){
				String numeJucator = linie.split(" ")[0];
				int scor = Integer.valueOf(linie.split(" ")[1]);
				Scor sc = new Scor(numeJucator, scor);
				scoruri.add(sc);
				linie = br2.readLine();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return scoruri;
	}
	
}
