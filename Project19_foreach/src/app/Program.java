package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		List<String> emails = new ArrayList<>();
		emails.add("john@gmail.com");
		emails.add("jim@yhahoo.com");
		emails.add("jack@yhahoo.com");
		
		for(int i=0; i<emails.size(); i++){
			
			System.out.println(emails.get(i));
		}
		
		System.out.println("**************************");
		
		for(String element : emails){
			System.out.println(element);
		}
		
		System.out.println("*****************************");
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextFloat());
		
		System.out.println("*****************************");
		
		List<String> links = new ArrayList<>();
		links.add("google.ro");
		links.add("yahoo.ro");
		links.add("pornhub.com");
		links.add("redtube.com");
		links.add("pizza.com");
		
		Set<Integer> linkuriCareAuFostAfisateDeja = new HashSet<>(); // aici pastram link-urile care au fost afisate deja 
		
		while(linkuriCareAuFostAfisateDeja.size() != 5){
			int numarRandomLink = rand.nextInt(5);
			if(linkuriCareAuFostAfisateDeja.contains(numarRandomLink)){
				
			}else{
				System.out.println(links.get(numarRandomLink));
				linkuriCareAuFostAfisateDeja.add(numarRandomLink);
			}
			
		}
		
		
	}

}
