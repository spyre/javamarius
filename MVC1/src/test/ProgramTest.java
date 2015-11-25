package test;

import java.util.List;

import dao.IDAOScoruri;
import dao.ScorDAOMySQL;
import model.Scor;

public class ProgramTest {

	public static void main(String[] args) {

//		ScorDAODummy dao = new ScorDAODummy();
		// ScorDAOMySQL dao = new ScorDAOMySQL();
//		ScorDAOFisiere dao = new ScorDAOFisiere();
		
		IDAOScoruri dao = new ScorDAOMySQL();  // Spring.getDAO("dao");
		
		
		List<Scor> scoruriGasite = dao.findAllScoruri();
		
		for(int i=0; i<scoruriGasite.size(); i++){
			System.out.println("Jucator: " + scoruriGasite.get(i).getNumeJucator() + " are scorul : " + scoruriGasite.get(i).getScor());
		}
	}

}
