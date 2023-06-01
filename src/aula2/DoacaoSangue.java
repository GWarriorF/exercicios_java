package aula2;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		
		int idade, pD; 
		String nome = ""; 
		boolean primeiraDoacao = false;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Este programa é para mostrar se você está apto para doar sangue.");
		
		//Entrada de dados
		System.out.print("\nQual é o seu nome: ");
		nome = ler.nextLine();	
		
		System.out.print("Qual é a sua idade: ");
		idade = ler.nextInt();
		
		System.out.print("Você já doou sangue antes?" + "\n1. Sim" + "\n2. Não" + "\nResposta: ");
		pD = ler.nextInt();
		
		//Tratamento de dado: Primeira doação 
		if (pD == 1) {
			primeiraDoacao =  true;
		}
		if (pD == 2) {
			primeiraDoacao = false;
		}
		
		//Tratamento de dados e Saídas: pessoa aptas e não aptas
		if (idade > 18 && idade < 60) {
			System.out.println("\n" + nome + " está apto(a) para doar sangue!");
		}else if (idade >= 60 && idade <= 69 && (primeiraDoacao == true)) {
			System.out.println("\n" + nome + " está apto(a) para doar sangue");
		}else if (idade >= 60 && idade <= 69 && (primeiraDoacao == false)) {
			System.out.println("\n" + nome + " não está apto(a) para doar sangue");
		}	
		
		ler.close();	

	}

}
