import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		
		int numarDeRepetitii = 0;
		System.out.println("Baga nr de repetitii: ");
		
		// citire tastatura
		Scanner scan = new Scanner(System.in);
		numarDeRepetitii = scan.nextInt();
		

		
		System.out.println("*****************");
		if(numarDeRepetitii > 10){
			System.out.println("Nu pot repeta pentru ca apare pe tot ecranul si nu am loc");
		}else{
			for(int i=0; i<numarDeRepetitii; i++){
				System.out.println("HELLO");
			}
		}
		
		System.out.println("*****************");
		if(numarDeRepetitii <= 10){
			for(int i=0; i<numarDeRepetitii; i++){
				System.out.println("GOODBYE");
			}
		}else{
			System.out.println("NU AM LOC");
		}
		
		
	}

}
