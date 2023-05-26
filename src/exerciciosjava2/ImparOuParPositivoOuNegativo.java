package exerciciosjava2;

import java.util.Scanner;

public class ImparOuParPositivoOuNegativo {

	public static void main(String[] args) {
		
		int numero; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Programa para verificar se um número é ímpar ou par e se é positivo ou negativo:");
		
		//Entrada de dados
		System.out.print("Entre com um um valor inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("\nO resultado é:");
		
		//Verificação ímpar ou par:
		if (numero % 2 == 0) {
			System.out.println("📌 Este número é par;");
		}else {
			System.out.println("📌 Este número é ímpar;");
		}
		
		// Verificação Positivo ou negativo: 
		if (numero > 0) {
			System.out.println("📌 Este número é positivo.");
		}else {
			System.out.println("📌 Este número é negativo.");
		}
		
		leia.close();
		
	}

}
