package dao;

import java.util.List;

import model.Scor;

// ce trebuie sa RESPECTE toate DAO-urile ale SCOR-ului
public interface IDAOScoruri {

	public List<Scor> findAllScoruri();
	// public void displayToateScorurile();
}
