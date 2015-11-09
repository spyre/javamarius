package app;

public class Program {

	public static void main(String[] args) {

		User u1 = new User("Billy", "1234");
		u1.setEmail("satriani@gmail.com");
		// u1.password = "5678"; // constructorul garanteaza crearea corecta, dar poti modifica
		u1.afiseazaUser();
	}

}
