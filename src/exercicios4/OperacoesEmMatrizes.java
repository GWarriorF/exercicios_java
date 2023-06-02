package exercicios4;

import java.util.Scanner;

public class OperacoesEmMatrizes {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int matrizUsuario [][] = new int[3][3]; 
		int vetorDiagoalP[] = new int [3], vetorDiagoalS[] = new int [3]; 
		int linha, coluna, somaDP = 0, somaDS = 0;
		
		//Informaçõe para o usuário
		System.out.println("Programa feito para facilitar operações dentro de uma matriz\n");
		
		for(linha = 0; linha <= 2; linha++) 
		{
			for(coluna = 0; coluna <= 2; coluna++) 
			{
				System.out.print("Digite o número que deseja inserir na matriz: ");
				matrizUsuario[linha][coluna] = ler.nextInt();
				
				if(linha == 0 && coluna == 0 || linha == 1 && coluna == 1 || linha == 2 && coluna == 2) 
				{
					vetorDiagoalP [coluna] = matrizUsuario[linha][coluna]; 
					somaDP += matrizUsuario[linha][coluna];
				}
				
				if(linha == 0 && coluna == 2 || linha == 1 && coluna == 1 || linha == 2 && coluna == 0) 
				{
					vetorDiagoalS [coluna] = matrizUsuario[linha][coluna]; 
					somaDS += matrizUsuario[linha][coluna];
				}
			}	
		}
		
		//Saída de dados
		System.out.print("\nElementos da Diagonal principal: " );
		for(int numerosVetor : vetorDiagoalP) 
		{
			System.out.print(numerosVetor + " ");
		}
		
		System.out.print("\nElementos da Diagonal Secundária: " );
		for(int numerosVetor : vetorDiagoalS) 
		{
			System.out.print(numerosVetor + " ");
		}
		
		System.out.print("\nSoma dos elementos da diagonal principal: " + somaDP);
		System.out.print("\nSoma dos elementos da diagonal principal: " + somaDS);
		
		ler.close();
	}

}
