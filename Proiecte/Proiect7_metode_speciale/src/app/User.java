package app;

public class User {

	public String username;
	public String password;
	
	public void displayUser(){
		System.out.println("Username: " + username + " password: " + password);
	}
	
	
	// metoda constructor
	// nu are nimic intre public si User
	public User(){
		System.out.println("*********");
	}
}
