package app;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		int notaF1 = 4;
		int notaF2 = 5;
		int notaF3 = 1;
		int notaF4 = 3;
		int notaF5 = 2;
		int notaF6 = 1;
		
		System.out.println("Nota film: " + notaF1);
		System.out.println("Nota film: " + notaF2);
		System.out.println("Nota film: " + notaF3);
		System.out.println("Nota film: " + notaF4);
		System.out.println("Nota film: " + notaF5);
		System.out.println("Nota film: " + notaF6);
		
		System.out.println("**********************************");
		
		int note[] = {4, 5, 1, 3, 2, 1}; // array = colectie de mai multe elemente de acelasi tip
		
		// avem un element care ia valorile 0, 1, ... 5
		for(int i=0; i<6; i++){
			System.out.println("NOTA " + note[i]);
		}
		
		System.out.println("**********************************");
		double preturi[] = {1.88, 2.99, 50.00, 2.88, 10.99, 99.99, 32.11};
		// majorare toate preturile cu 2
		for(int i=0; i< preturi.length; i++){
			preturi[i] = preturi[i] + 2;
		}
		for(int i=0; i< preturi.length; i++){  // orice array are un length pentru a afla numarul de elemente (x) din preturi in mod dinamic 
			System.out.println("PRET: " + preturi[i]);
		}
		
		System.out.println(preturi.length);
		
		System.out.println("**********************************");
		String comments[] = {"Hello world", "Java e misto", "Pizza", "i dont like it fuck it"};
		for(int i=0; i<comments.length; i++){
			if(comments[i].contains("fuck")){
				System.out.println("CENSORED");
			}else{
				System.out.println(comments[i]);
			}
		}
		
		// comments[4] = "SOmething"; // un array are o dimensiune FIXA
		
		System.out.println("**********************************");
		List<String> comentarii = new ArrayList<>();
		comentarii.add("Hello");
		comentarii.add("Welcome");
		System.out.println(comentarii);  // nu este necesar FOR
		for(int i=0; i<comentarii.size(); i++){
			System.out.println("Comentariu: " + comentarii.get(i));
		}
		
		comentarii.add("Something else");
		System.out.println(comentarii);
		
	}

}
