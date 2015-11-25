package dao;

import java.util.ArrayList;
import java.util.List;

import model.Scor;

public class ScorDAODummy implements IDAOScoruri{

	// conectare la bd / luare date din fisiere / ...
	// un test
	
	public List<Scor> findAllScoruri(){ // select * from scoruri
		List<Scor>scoruri = new ArrayList<>();
		
		Scor s1 = new Scor("Ion", 23122);
		Scor s2 = new Scor("Jack", 33332);
		scoruri.add(s1);
		scoruri.add(s2);
		
		return scoruri;
	}
}
