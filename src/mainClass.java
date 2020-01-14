
public class mainClass {
	
public static void main (String[] args) {
		
		
		 Veicolo veicolo = new Veicolo ("A180", "CR000NI", "merchedes",1500, 1997, 1, 2);
		
		Casello Pescara = new Casello("Pescara", 300);
		Casello Chieti = new Casello("Chieti", 317);
		Casello Aquila = new Casello("Aquila", 340);
		Casello Teramo = new Casello("Teramo", 370);

		double[] tariffe = new double[] {1,2,3,4,5};

		Autostrada autostrada1 = new Autostrada("A14", tariffe, Pescara, Chieti, Aquila, Teramo);

		Percorso percorso = new Percorso(Pescara,Aquila, autostrada1);

		System.out.print(Pedaggio.calcolaPedaggio(veicolo, percorso));
		
	}
}
