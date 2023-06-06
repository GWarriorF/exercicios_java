package exercicios8;

public class Terrestre extends Transporte 
{
		private int numeroRodas;
		protected int velocidade;
		
		public Terrestre(int capacidade, int numeroRodas, int velocidade) 
		{
			super(capacidade);
			this.numeroRodas = numeroRodas;
			this.velocidade = velocidade;
		}

		public int getNumeroRodas() {
			return numeroRodas;
		}

		public void setNumeroRodas(int numeroRodas) {
			this.numeroRodas = numeroRodas;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		
		public void printTerreste()
		{
			super.printTransporte();
			System.out.println("Numero de rodas: " + numeroRodas);
			System.out.println("Velocidade: " + velocidade);
		}
		 
		
		
		
}
