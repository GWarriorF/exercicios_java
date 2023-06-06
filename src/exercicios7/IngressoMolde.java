package exercicios7;

public class IngressoMolde 
{
		private String local, data,	nomeEvento, nomeComprador;
		private float custo;

		public IngressoMolde(String local, String data, float custo, String nomeEvento, String nomeComprador) 
		{
			this.local = local;
			this.data = data;
			this.custo = custo;
			this.nomeEvento = nomeEvento;
			this.nomeComprador = nomeComprador;
		}
		
		public void printIngresso() 
		{
			System.out.println("Nome do Participante: " + nomeComprador);
			System.out.println("Nome do evento: " + nomeEvento);
			System.out.println("Data do evento: " + data);
			System.out.println("Local: " + local);
			System.out.println("Valor pago: R$" + custo + "\n");
			
		}

		public String getLocal() {
			return local;
		}

		public void setLocal(String local) {
			this.local = local;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public float getCusto() {
			return custo;
		}

		public void setCusto(float custo) {
			this.custo = custo;
		}

		public String getNomeEvento() {
			return nomeEvento;
		}

		public void setNomeEvento(String nomeEvento) {
			this.nomeEvento = nomeEvento;
		}

		public String getNomeComprador() {
			return nomeComprador;
		}

		public void setNomeComprador(String nomeComprador) {
			this.nomeComprador = nomeComprador;
		} 
		
		
		
		
		
}
