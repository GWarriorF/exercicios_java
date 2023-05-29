package exerciciosjava3;

import java.util.Scanner;

public class PesquisaTI {

	public static void main(String[] args) {
		
		int idade = 0, sexo = 0, categoria = 0, backend = 0,
				mulheresFrontend = 0, devMob = 0, mulheresFullstack = 0, continua = 1;
		
		Scanner ler = new Scanner("System.in");
		
		//Informações para o usuário
		System.out.println("Pesquisa desenvolvida para saber o número de devs em backend,"
				+ " de mulheres devs em frontend, de devs mobile maiores de 40 anos e de"
				+ " mulheres devs FullStack menores de 30 anos");
		System.out.println("\nTabela sexo: " + "\n1. Masculino" + "\n2. Feminino" + "\n3. Outros" );
		System.out.println("\nTabela categoria: " + "\n1. Backend" + "\n2. Frontend" + "\n3. Mobile" + "\n4. FullStack" );
		System.out.println("\nPara continuar:" + "\n1. Entrada de outro colaborador" 
							+ "\n2. Todos os colaboradores responderam a pesquisa");
		
		//Entrada e tratamento de dados
		while(continua == 1) {
			
			System.out.print("\nQual é sua idade: ");
			idade = ler.nextInt();	
			System.out.print("\nQual é seu sexo: ");
			sexo = ler.nextInt();	
			System.out.print("\nQual é sua categoria: ");
			categoria = ler.nextInt();
			
			
			System.out.print("\nVocê deseja continuar (sim ou não)? ");
			continua = ler.nextInt();
		}
		
	}

}
