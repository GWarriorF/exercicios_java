package aula3;

import java.util.Scanner;

public class VerificacaoIdade {

	public static void main(String[] args) {
		
		int idade = 0, idadeMaior = 0, idadeMenor = 0, idadeMedia = 0, validacao = 0;
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa criado para filtrar a quantidade de "
				+ "pessoas com idade maior que 50 e menor que 21");
		System.out.println("Para para a verificação, basta digitar uma idade negativa." + "\n");
		
		//Entrada de dados e tratamento de dados	
		while (validacao >= 0) {
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();  
			
			if (idade <= 21 ) 
			{
				idadeMenor = idadeMenor + 1;
			}else if (idade >= 50){
				idadeMaior = idadeMaior + 1;
			}else {
				idadeMedia = idadeMedia + 1; 
			}
			
			validacao = idade;
		}
		
		idadeMenor = idadeMenor - 1;
				
		//Saída de Dados
		System.out.println("\nTotal de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas Maiores de 50 anos: " + idadeMaior);
		
		ler.close();
	}

}
