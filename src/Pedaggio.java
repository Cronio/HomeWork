public abstract class Pedaggio {
			
			public static double calcolaPedaggio(Veicolo veicolo, int iva, Percorso...percorso ) {	
				
				double tariffa = 0.0;
				
				for(Percorso p : percorso) {
					tariffa += p.getDistanza() * p.getAutostrada().getTariffa(veicolo.getClassificazione());
				}
				
				tariffa = tariffa + tariffa * iva / 100;
				tariffa = arrotondamento(tariffa);
				return tariffa;
			}
			
			public static double calcolaPedaggio(Veicolo v, Percorso...percorso) {
				
				double tariffa = 0.0;
				int iva = 22;
				
				for(Percorso p : percorso) {
					tariffa += p.getDistanza() * p.getAutostrada().getTariffa(v.getClassificazione());
				}
				
				tariffa = tariffa + tariffa * iva / 100;
				tariffa = arrotondamento(tariffa);
				return tariffa;
			}
			
			private static double arrotondamento(double i) {
				
				i *= 100;
				i = java.lang.Math.round(i);
				double modulo = i % 10;
				if(modulo <= 5) i -= modulo;
				else i = i + 10 - modulo;
				return i / 100;
			}
	}