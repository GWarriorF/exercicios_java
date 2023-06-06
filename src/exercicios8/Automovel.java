package exercicios8;

public class Automovel 
{
	private String cor, placa;
	private int numeroRodas, marcha;
	
	public Automovel(String cor, String placa, int numeroRodas, int marcha)
	{
		this.cor = cor;
		this.placa = placa;
		this.numeroRodas = numeroRodas;
		this.marcha = marcha;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	} 
	
	
	
	
}
