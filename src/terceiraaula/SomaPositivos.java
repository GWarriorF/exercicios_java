package terceiraaula;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		int numero, soma = 0; 
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa feito para fazer a adição de números positivos." + "\n");
		
		//Entrada e tratamento de dados
		do{
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			
			if (numero >= 1) {
				soma = soma + numero;
			}
	
		}while (numero != 0);
		
		//Saída de dados
		System.out.println("\nA soma dos números positivos é: " + soma);
		ler.close();

	}

}
