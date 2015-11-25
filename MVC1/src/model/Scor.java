package model;

// create table scoruri(id int primary key auto_increment, nume_jucator varchar(240) not null, scor int not null);
public class Scor {
	
	private int id;
	private String numeJucator;
	private int scor;
	
	
	
	public Scor(String numeJucator, int scor) {
		this.numeJucator = numeJucator;
		this.scor = scor;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeJucator() {
		return numeJucator;
	}
	public void setNumeJucator(String numeJucator) {
		this.numeJucator = numeJucator;
	}
	public int getScor() {
		return scor;
	}
	public void setScor(int scor) {
		this.scor = scor;
	}
	
	
}
