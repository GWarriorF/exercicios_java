package exercicios7;
public class TestaJogos {

	public static void main(String[] args) 
	{
		ProdutoJogo jogo1 = new ProdutoJogo("God Of War", "Play Station", "Ação e Aventura", "+17", 350.50f);	
		jogo1.Visualiza();
		
		ProdutoJogo jogo2 = new ProdutoJogo("Ori", "Play Station", "Ação e Aventura", "+17", 350.50f);	
		jogo2.Visualiza();
	}

}
