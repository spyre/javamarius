package app;

public class Program {

	public static void main(String[] args) {

		Cont c1 = new Cont();
		
		c1.depunere();
		c1.depunere();
		c1.depunere();
		c1.retragere();
		
		System.out.println("=====================");
		Cont c2 = new Cont();
		
		c2.retragere();
		
		Cont c3 = new Cont();
		
		c3.depunere();
		
		Cont c4 = new Cont();
		c4.depunere();
		
	}

}
