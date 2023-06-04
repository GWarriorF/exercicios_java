package exercicios7;

public class ClienteTeste {

	public static void main(String[] args) 
	{
		
		ClienteMolde cliente1 = new ClienteMolde("Gabriela Guerra Figueiredo", "Mulher Cis", "Jogos", 20, "11946157479");
		cliente1.PrintCliente();
		
		ClienteMolde cliente2 = new ClienteMolde("Fernando Amaro", "Homem Cis", "Eletrodomésticos", 30, "11950688712");
		cliente2.PrintCliente();
		
	}
	
}
