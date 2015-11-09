package app;

public class User {

	public String username;
	public String password;
	public String email;
	
	public void setEmail(String e){
		email = e;
	}
	
	public User(String un, String pwd){
		username = un;
		password = pwd;
	}
	
	public void afiseazaUser(){
		System.out.println("Username = " + username + " password = " + password + " email = " + email);
		
	}
}
