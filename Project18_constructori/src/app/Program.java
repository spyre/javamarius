package app;

public class Program {

	
	public static void main(String[] args) {
		User u1 = new User("John", "1234", "83120sadk", 312);
//		u1.setId(312);
//		u1.setPassword("1234");
		System.out.println(u1.getUsername());
		
		
		// poti alege intre constructori
		// varianta 1
		User u2 = new User("Bill", "3ddds", "38291s", 92318);
		
		// varianta 2
		User u3 = new User("Satriani", "398210");
		
	}
}
