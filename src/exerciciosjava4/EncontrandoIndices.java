package exerciciosjava4;

import java.util.Arrays;
import java.util.Scanner;

public class EncontrandoIndices {

	public static void main(String[] args) {
		
		int vetorNumerosAleatorios[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, posicao, elemento;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa desenvolvido para você encontrar a posição de um determinado número" 
						+ "\n\nNúmeros do vetor a serem escolhidos: 1, 2, 3, 4, 5, 6, 7, 8, 9 e 10");
		
		//Entrada de dados
		System.out.print("\nDigite o número que você deseja encontrar: ");
		elemento = ler.nextInt();
		
		//tratamento de dados
		
		posicao = Arrays.binarySearch(vetorNumerosAleatorios, elemento);
		
		if (posicao >= 0) 
		{
			System.out.print("\nO elemento " + elemento + " está na posição: " + posicao);
		}else 
		{
			System.out.print("\nO elemento " + elemento + " não foi encontrado");
		}
		
		ler.close();

	}

}
