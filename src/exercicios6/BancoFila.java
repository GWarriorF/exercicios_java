package exercicios6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BancoFila {

	public static void main(String[] args) {
		
		Queue<String> clientesBanco= new LinkedList<String>();
		Integer opcaoEscolhida = 1;
		String  novaPessoaFila, printLista; 
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Programa utilizado para gerenciar uma fila de banco");
		System.out.println("\nMenu de opções: " 
							+ "\n1. Adicionar Clientes na fila" 
							+ "\n2. Listar todos os clientes;" 
							+ "\n3. Atender cliente" + "\n0. Sair" + "\n");
		
		//Entrada de pessoas na fila
		while(opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida != 0) 
		{
			System.out.print("Qual opção escolhida? ");
			opcaoEscolhida = ler.nextInt();
			
			switch (opcaoEscolhida)
			{
				case 1: 
					System.out.print("Digite o nome do cliente: ");
					novaPessoaFila = ler.nextLine();
					clientesBanco.add(novaPessoaFila);
					System.out.println("Cliente adicionado!" + "\n");
					break;
				case 2: 
					System.out.println("\nClientes na fila: ");
					for (Iterator<String> iClientes = clientesBanco.iterator(); iClientes.hasNext();) 
					{
						printLista = iClientes.next();
						System.out.println(printLista);
					}
					System.out.println("\n");
					break;
				case 3: 
					System.out.print("Próximo Cliente: " + clientesBanco.peek());
					clientesBanco.poll();
					System.out.println("\nO Cliente foi chamado!" + "\n");
					break;
				case 0: 
					clientesBanco.clear();
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
