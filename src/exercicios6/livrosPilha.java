package exercicios6;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class livrosPilha {

	public static void main(String[] args) {
	
		Stack <String> pilhaLivros = new Stack<String>();
		String  novoLivro, printLista; 
		Integer opcaoEscolhida = 1;
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa utilizado para gerenciar livros em uma pilha");
		System.out.println("\nMenu de opções: " + "\n1. Adcionar livro na pilha" + "\n2. Listar todos livros" 
							+ "\n3. Retirar livro da pilha" + "\n0. Sair" + "\n");
		
		//Entrada de livros na pilha
		while(opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida != 0) 
		{
			System.out.print("Qual opção escolhida? ");
			opcaoEscolhida = ler.nextInt();
			
			switch (opcaoEscolhida)
			{
				case 1: 
					System.out.print("Digite o nome do livro: ");
					ler.nextLine();
					novoLivro = ler.nextLine();
					pilhaLivros.push(novoLivro);
					System.out.println("Livro adicionado!" + "\n");
					break;
				case 2: 
					System.out.println("\nLivros na pilha: ");
					for (Iterator<String> iLivros = pilhaLivros.iterator(); iLivros.hasNext();) 
					{
						printLista = iLivros.next();
						System.out.println(printLista);
					}
					System.out.println("\n");
					break;
				case 3: 
					System.out.print("Reirada do livro: " + pilhaLivros.peek());
					pilhaLivros.pop();
					System.out.println("\nO livro foi retirado!" + "\n");
					break;
				case 0: 
					pilhaLivros.clear();
					System.out.println("\nPrograma finalizado!");
					break;
				default: 
					System.out.println("\nOpção Inválida!");
					break;	
			}
			
		}
		
		ler.close();

	}

}
