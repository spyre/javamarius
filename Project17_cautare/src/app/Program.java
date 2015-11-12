package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		List<Integer> cnpuri = new ArrayList<>();
		cnpuri.add(17);
		cnpuri.add(20);
		cnpuri.add(21);
		cnpuri.add(33);
		cnpuri.add(40);
		cnpuri.add(45);
		
		System.out.println("BAGA CNP: ");
		Scanner scan = new Scanner(System.in);
		Integer cnpUser = scan.nextInt();
		System.out.println("Ai introdus: " + cnpUser);
		
		for(int i=0; i<cnpuri.size(); i++){
			if(cnpUser == cnpuri.get(i)){
				System.out.println("AM GASIT LA POZITIA " + i);
				break;
			}
			System.out.println(i);
		}
	}

}
