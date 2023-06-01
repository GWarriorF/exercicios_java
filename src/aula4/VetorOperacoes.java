package aula4;

import java.util.Scanner;

public class VetorOperacoes {

	public static void main(String[] args) {
		
		int vetorNumerosUsuario [] = new int [10];
		int indice, soma = 0, media = 0;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa feito para realizar operações dentro de um vetor" + "\n");
		
		//Entrada de dados 
		for (indice = 0; indice <= 9; indice++) 
		{
			System.out.print("Entre com o " + (indice + 1) + "° valor: ");
			vetorNumerosUsuario[indice] = ler.nextInt();
		}
		
		//Elementos no indice impar
		System.out.print("\nElementos no indice impar: ");
		for (indice = 1; indice <= 10; indice += 2) 
		{
			System.out.print(vetorNumerosUsuario[indice] + " ");
		}
				
		//Elementos pares
		System.out.print("\nElementos pares: ");
		for (indice = 0; indice <= 9; indice++) 
		{
			if (vetorNumerosUsuario[indice] % 2 ==0) 
			{
				System.out.print(vetorNumerosUsuario[indice] + " ");
			}
		}

		//Soma dos elementos do vetor
		for (indice = 0; indice <= 9; indice++) 
		{
			soma = soma + vetorNumerosUsuario[indice];
		}
		
		System.out.println("\nSoma de todos elementos: " + soma);
		
		//Media
		media = soma / 10;
		
		System.out.println("Média de de todos os elementos: " + media);
	
		ler.close();
		
	}

}
