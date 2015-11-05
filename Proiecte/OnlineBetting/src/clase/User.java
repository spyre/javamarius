package clase;

public class User {

	public String username;
	public String password;
	
	public void salveazaInBD(){
		System.out.println("Salvam in MySQL : " + username + " " + password);
		String sql = "INSERT INTO bd ....";
	}
	
}
