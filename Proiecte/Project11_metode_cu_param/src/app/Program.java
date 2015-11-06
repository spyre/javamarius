package app;

public class Program {

	public static void main(String[] args) {

		Cont cont1 = new Cont();
		cont1.numeCont = "ROBRD830921";
		cont1.depunere5000();
		cont1.depunere1000();
		
		cont1.retragereAltaSuma(850);
		cont1.retragereAltaSuma(50);
		cont1.displayCont();
	}

}
