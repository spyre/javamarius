package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		List<Integer> persoane = new ArrayList<>();
		persoane.add(17);
		persoane.add(20);
		persoane.add(31);
		persoane.add(17);
		
		List<Integer> pu = new ArrayList<>();
		
		System.out.println(persoane);
		
		Set<Integer> persoaneUnice = new HashSet<>();
		persoaneUnice.add(17);
		persoaneUnice.add(20);
		persoaneUnice.add(31);
		persoaneUnice.add(17);
		
		System.out.println(persoaneUnice);
		
	}

}
