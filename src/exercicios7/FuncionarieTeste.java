package exercicios7;

public class FuncionarieTeste {

	public static void main(String[] args) 
	{
		
		FuncionarieMolde funcionarie1 = new FuncionarieMolde("Gabriela Guerra Figueiredo", "Ux Design", 
															"Design", 10000.00f, 480f);
		funcionarie1.PrintFuncionarie();
		FuncionarieMolde funcionarie2 = new FuncionarieMolde("Fernando Amaro", "Apontador", "Engenharia/Construção",
															3000.00f, 480f);
		funcionarie2.PrintFuncionarie();
		
	}

}
