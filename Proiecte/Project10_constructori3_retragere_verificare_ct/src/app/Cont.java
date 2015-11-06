package app;

public class Cont {
	
	public int sold;
	public String numeCont;
	
	public void displayCont(){
		System.out.println(numeCont + " are " + sold + " EURO");
	}
	
	public void retragere1000(){
		if(sold < 1000){
			System.out.println("INSUFICIENT");
		}else{
			sold = sold - 1000;
		}
	}
	
	public void depunere1000(){
		sold = sold + 1000;
	}
	
	public Cont(){
		System.out.println("Un nou cont este creat");
	}

}
