package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clase.User;

public class Program {

	public static void main(String[] args) {
		
		User u1 = new User("Marius", "1234");
		User u2 = new User("Alex", "3322");
		User u3 = new User("Jim", "xyz123");
		User u4 = new User("Bob", "oo88");
		u1.esteAdmin = true;
		u2.esteAdmin = false;
		u3.esteAdmin = false;
		u4.esteAdmin = false;
		
		List<User> useri = new ArrayList<>();
		useri.add(u1);
		useri.add(u2);
		useri.add(u3);
		useri.add(u4);
		
		// username + password
		List<String> usernames = new ArrayList<>();
		usernames.add("Marius");
		usernames.add("Alex");
		usernames.add("Jim");
		usernames.add("Bob");
		
//		List<String> passwords = new ArrayList<>();
//		passwords.add("1234");
		
		System.out.println(usernames.size());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Username: ");
		String user = scan.nextLine();
		System.out.println("Password: ");
		String password = scan.nextLine();
		
		System.out.println("Ai bagat: " + user + " " + password);
		
//		for(int i=0; i< usernames.size(); i++){
//			if(user.equals(usernames.get(i))){  // equals pentru String-uri
//				System.out.println("ARE ACCES");
//			}
//		}
		
		boolean amGasit = false;
		
		for(int i=0; i<useri.size(); i++){
			if(user.equals(useri.get(i).username) && password.equals(useri.get(i).password) ){
				// am gasit user-ul
				amGasit = true;
				break; // cand gaseste opreste for-ul
			}
		}
		
		if(amGasit){
			System.out.println("ACCESS");
		}else{
			System.out.println("NO ACCESS");
		}
		
	}

}
