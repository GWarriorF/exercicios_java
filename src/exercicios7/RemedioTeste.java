package exercicios7;

public class RemedioTeste {

	public static void main(String[] args) 
	{
		RemedioMolde remedio1 = new RemedioMolde("Paracetamol", "Analgésico", "Via Oral", "Comprimido",
												"750mg, 20 comprimidos");
		remedio1.PrintRemedio();
		RemedioMolde remedio2 = new RemedioMolde("Amoxicilina", "Antibiótico", "Via Oral", "Líquido",
												 "1503ML");
		remedio2.PrintRemedio();
		
	}

}
