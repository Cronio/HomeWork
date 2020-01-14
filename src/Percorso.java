public class Percorso {

		private Casello daCasello;
		private Casello aCasello;
		private Autostrada autostrada;
		
		public Percorso (Casello daCasello, Casello aCasello, Autostrada autostrada) {			
			this.daCasello = daCasello;
			this.aCasello = aCasello;
			this.autostrada = autostrada;
		}
		

		public int getDistanza() {
			int distanza;
			distanza = daCasello.getKilometro() - aCasello.getKilometro();
			return distanza;
		}

		public Casello getDaCasello() {
			return daCasello;
		}
		
		public Casello getACasello() {
			return aCasello;
		}
		
		public Autostrada getAutostrada() {
			return autostrada;
		}

		public void setDaCasello (Casello daCasello) {
			this.daCasello = daCasello;
		}

		void setACasello (Casello aCasello) {
			this.aCasello = aCasello;
		}
		
		public void setAutostrada (Autostrada autostrada) {
			this.autostrada = autostrada;
		}	
}