public class Program {

	public static void main(String[] args) {

		Cont cont1 = new Cont();
		cont1.numeCont = "ROING39210";
		cont1.suma = 1030000;

		Cont cont2 = new Cont();
		cont2.numeCont = "UKING908321";
		cont2.suma = 99000;

		cont1.afiseazaInfoCont();
		cont2.afiseazaInfoCont();

		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();
		// cont1.retrageZeceMii();

		for (int i = 5; i < 10; i++) {
			
			cont1.retrageZeceMii();
			
		}

		cont1.afiseazaInfoCont();
	}

}
