package app;

public class Program {

	public static void main(String[] args) {

		Cont c1 = new Cont();
		c1.numeCont = "ROINGB380921";
		c1.sold = 0;
		
		c1.retragere1000();
		c1.retragere1000();
		
		c1.displayCont();
		
		Cont c2 = new Cont();
		c2.numeCont ="UKING309821";
		c2.sold = 10000;
		
		c2 = new Cont();
		
		c2.retragere1000();
		
		c2.displayCont();
		
	}

}
