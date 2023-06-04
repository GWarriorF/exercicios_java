package exercicios7;
public class JogoTeste 
{

	public static void main(String[] args) 
	{
		JogoMolde jogo1 = new JogoMolde("God Of War", "Play Station", "Ação e Aventura", "+17", 350.50f);	
		jogo1.PrintJogo();
		
		JogoMolde jogo2 = new JogoMolde("Ori", "Play Station", "Ação e Aventura", "+17", 350.50f);	
		jogo2.PrintJogo();
	}

}
