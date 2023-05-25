package exerciciosjava2;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		float termo1, termo2;
		int operacao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora Simples:");
		
		System.out.println("\nGuia de Operações ");
		System.out.println("1. Soma;");
		System.out.println("1. Subtração;");
		System.out.println("1. Multiplicação;");
		System.out.println("1. Divisão.");
		
		System.out.print("\nQual operação você deseja realizar? ");
		operacao = ler.nextInt();
		System.out.print("\nDigite o valor do primeiro termo: ");
		termo1 = ler.nextFloat();
		System.out.print("Digite o valor do segundo termo: ");
		termo2 = ler.nextFloat(); 
		
		switch (operacao) {
		case 1:
			System.out.println("\nResultado da soma dos termos: " + (termo1 + termo2));
			break;
		case 2:
			System.out.println("\nResultado da diferença dos termos: " + (termo1 - termo2));
			break;
		case 3:
			System.out.println("\nResultado do produto dos termos: " + (termo1 * termo2));
			break;
		case 4:
			System.out.println("\nResultado do quociente dos termos: " + (termo1 / termo2));
			break;
		}
		
		ler.close();

	}

}
