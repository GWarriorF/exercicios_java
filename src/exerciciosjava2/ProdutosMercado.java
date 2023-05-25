package exerciciosjava2;

import java.util.Scanner;

public class ProdutosMercado {

	public static void main(String[] args) {
		
		final float P1 = 10.00f, P2 = 15.00f, P3 = 18.00f, P4 = 12.00f, P5 = 08.00f, P6 = 13.00f;
		int quantidadeProduto, produtoEscolhido;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Programa feito para saber o valor total de uma compra:");
		
		//Vizualização para o Cliente
		System.out.println("\nCatálogo");
		System.out.println("1. Cachorro quente: " + P1 + " reais;");
		System.out.println("2. X-Salada: " + P2 + " reais;");
		System.out.println("3. X-Bacon" + P3 + " reais;");
		System.out.println("4. Bauru: " + P4 + " reais;");
		System.out.println("5. Refrigerante: " + P5 + " reais;");
		System.out.println("6. Suco de laranja: " + P6 + " reais.");
		 
		//Entrada de dados 
		System.out.print("\nDigite o número do produto escolhido: ");
		produtoEscolhido = ler.nextInt();
		System.out.print("Digite a quantidade levada do produto: ");
		quantidadeProduto = ler.nextInt();
		
		//Saída de dados
		System.out.println("\nNota Fiscal:");
		switch (produtoEscolhido) {
		case 1: 
			System.out.println("Produto escolhido: " + quantidadeProduto + " Cachorro(s) quente(s);");
			System.out.println("Valor do Produto: " + P1 + " reais;");
			System.out.println("Valor total: " + P1 * quantidadeProduto + " reais.");
			break;
			
		case 2: 
			System.out.println("Produto escolhido: " + quantidadeProduto + " X-Salada(s);");
			System.out.println("Valor do Produto: " + P2 + " reais;");
			System.out.println("Valor total: " + P2 * quantidadeProduto + " reais.");
			break;
			
		case 3:
			System.out.println("Produto escolhido: " + quantidadeProduto + " X-Bacon(s);");
			System.out.println("Valor do Produto: " + P3 + " reais;");
			System.out.println("Valor total: " + P3 * quantidadeProduto + " reais.");
			break;
			
		case 4: 
			System.out.println("Produto escolhido: " + quantidadeProduto + " Bauru(s);");
			System.out.println("Valor do Produto: " + P4 + " reais;"); 
			System.out.println("Valor total: " + P4 * quantidadeProduto + " reais.");
			break; 
			
		case 5: 
			System.out.println("Produto escolhido: " + quantidadeProduto + " Refrigerante(s);");
			System.out.println("Valor do Produto: " + P5 + " reais;");
			System.out.println("Valor total: " + P5 * quantidadeProduto + " reais.");
			break;
			
		case 6:
			System.out.println("Produto escolhido: " + quantidadeProduto + " Suco(s) de laranja;");
			System.out.println("Valor do Produto: " + P6 + " reais;");
			System.out.println("Valor total: " + P6 * quantidadeProduto + " reais.");
			break;
		}
		
		
		ler.close();
		
	}

}
