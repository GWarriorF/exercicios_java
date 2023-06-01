package exercicios3;

import java.util.Scanner;

public class MediaMultiplo3 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float  quantidadeNumero = 0.0f, numero = 0.0f, media = 0.0f, soma = 0.0f;
		
		//Informações para o usuário
		System.out.println("Programa feito para fazer a média de todos os números multiplos de 3\n");
		
		//Entrada de dados e tratamento
		do 
		{
			System.out.print("Entre com um número: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) 
			{
				quantidadeNumero ++;
				soma = soma + numero;
			}
		}while(numero != 0 );
		
		quantidadeNumero --;
		media = soma / quantidadeNumero;
		
		//Saída de dados
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", media);
		
		ler.close();
	}

}
