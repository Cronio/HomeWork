public class Veicolo{
	
	private String modello, targa , marca;
	private int peso, anno, assi, classeEuro;
	private double altezza;

	public Veicolo(String modello, String targa, String marca, int peso, int anno, int assi, double altezza) {
		 this.modello = modello;
		 this.targa = targa;
		 this.marca = marca;
		 this.peso = peso;
		 this.anno = anno;
		 this.assi = assi;
		 this.altezza = altezza;
	}

	public Veicolo(String modello, String targa, String marca, int peso, int anno, int assi, double altezza, int classeEuro) {
		 this.modello = modello;
		 this.targa = targa;
		 this.marca = marca;
		 this.peso = peso;
		 this.anno = anno;
		 this.assi = assi;
		 this.altezza = altezza;
		 this.classeEuro = classeEuro;
	}
	
	public int getClassificazione() {
		int classificazione = 0;
			if (assi <=1 )
				classificazione = 1;
			
			if (assi == 2 && altezza <= 1.3)
				classificazione = 1;
			
			if (assi == 2 && altezza > 1.3)
				classificazione = 2;
			
			if (assi == 3)
				classificazione = 3;
			
			if (assi == 4)
				classificazione = 4;
			
			if (assi >= 5)
				classificazione = 5;
			
			if (classificazione == 0) 
				System.out.println("abbiamo un problema");
			
			return classificazione;
		}
	
//get
		public String getModello() {
			return modello;
		}

		public String getTarga() {
			return targa;
		}

		public String getMarca() {
			return marca;
		}
		
		public int getPeso() {
			return peso;
		}

		public int getAnno() {
			return anno;
		}

		public int getNumeroAssi() {
			return assi;
		}
		
		public double getAltezza() {
			return altezza;
		}
		
		public int getClasseEuro() {
			return this.classeEuro;
		}
		
		
//set
		public void setModello (String modello) {
			this.modello = modello;
		}
		
		public void setTarga (String targa) {
			this.targa = targa;
		}
		
		public void setMarca (String marca) {
			this.marca = marca;
		}
		
		public void setPeso (int peso) {
			this.peso = peso;
		}
		
		public void setAnno (int anno) {
			this.anno = anno;
		}
		
		public void setNumeroAssi (int assi) {
			this.assi = assi;
		}

		public void setAltezza (double altezza) {
			this.altezza = altezza;
		}

		public void setClasseEuro (int classeEuro) {
			this.classeEuro = classeEuro;
		}	
	}