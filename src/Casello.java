public class Casello {
	
		private String nome;
		private int kilometro;
		
		public Casello(String nome, int km) {
			this.nome = nome;
			this.kilometro = km;
		}

		public String getNome() {
			return nome;
		}
		
		public int getKilometro() {
			return kilometro;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setKilometro(int km) {
			this.kilometro = km;
		}
}