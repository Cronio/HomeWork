import java.util.HashSet;

	public class Autostrada {

		private String nome;
		private HashSet<Casello> caselliList = new HashSet<Casello>();
		private double[] tariffa = new double[5];
		
		public Autostrada (String nome, double[] tariffa, Casello...caselli ) {
			this.nome = nome;
			this.tariffa = tariffa;
			
			for(Casello c : caselli) {
				this.caselliList.add(c);
			}
		}

		public void addCasello (Casello c) {		
			caselliList.add(c);
			return;
		}
		
		public String getNome(){
			return this.nome;
		}

		public Casello getCasello (String nome) {
			for(Casello c : caselliList) {
				if(c.getNome().equals(nome))
					return c;
			}
			return null;
		}
		
		public HashSet<Casello> getListaCaselli(){
			return caselliList;
		}
		
		public double getTariffa (int classificazioneVeicolo) {
			return tariffa[classificazioneVeicolo- 1];
		}
		
		public void setName (String nome){
			this.nome = nome;
		}
		
		public void setTariffa (double tariffa, int classificazioneVeicolo) {
			this.tariffa[classificazioneVeicolo - 1] = tariffa;
		}
	}