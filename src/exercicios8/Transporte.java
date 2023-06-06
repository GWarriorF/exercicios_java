package exercicios8;

public class Transporte 
{
	private int capacidade;

	public Transporte(int capacidade) 
	{
		this.capacidade = capacidade;
	}
	
	public void printTransporte() 
	{
		System.out.println("Saudações. Nossa capacidade é: " + capacidade);
	}

	public int getCapacidade() 
	{
		return capacidade;
	}

	public void setCapacidade(int capacidade) 
	{
		this.capacidade = capacidade;
	}
	
	
	
	
}
