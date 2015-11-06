package app;

public class Cont {
	
	public int sold;
	public String numeCont;
	
	public void displayCont(){
		System.out.println(numeCont + " are " + sold + " EURO");
	}
	
	public void retragere1000(){
			sold = sold - 1000;
	}
	
	public void depunere1000(){
		sold = sold + 1000;
	}
	
	public void retragere5000(){
		sold = sold - 5000;
	}

	public void depunere5000(){
		sold = sold + 5000;
	}
	
	public void retragereAltaSuma(int sumaDeRetras){
		sold = sold - sumaDeRetras;		
	}

}
