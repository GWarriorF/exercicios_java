package exercicios4;

import java.util.Scanner;

public class MediaAlunesVetores {

	public static void main(String[] args)
	{
		float matrizNotas[][] = new float[10][4], vetorMedia[] = new float[10];
		float soma = 0.0f, media = 0.0f;
		int linha, coluna, alune = 1;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa feito para descobrir a média de 10 alunes" + "\n");
	
		//Entrada e tratamento de dados
		for(linha = 0; linha <= 9; linha ++) 
		{
			for(coluna = 0; coluna <= 3; coluna ++) 
			{
				System.out.print("Escreva a " + (coluna + 1) + "° nota do "
								 + (linha + 1) + "° alune: ");
				matrizNotas[linha][coluna] = ler.nextFloat();
				soma = soma + matrizNotas[linha][coluna];
			}
			media = soma / 4;
			vetorMedia[linha] = media;
			soma = 0.0f;
		}
		
		
		//Saída de dados
		for(float aluneMedia : vetorMedia) 
		{
			System.out.printf("\nA média do " + alune++ + "° é: %.2f", aluneMedia);
		}
			
	}

}
