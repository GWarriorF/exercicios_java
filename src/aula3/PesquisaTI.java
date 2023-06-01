package aula3;

import java.util.Scanner;

public class PesquisaTI {

	public static void main(String[] args) {
		
		int idade = 0, sexo = 0, categoria = 0, backend = 0,
				mulheresFrontend = 0, devMob = 0, mulheresFullstack = 0;
		
		String continua = "Sim";
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Pesquisa desenvolvida para saber o número de devs em backend,"
				+ " de mulheres devs em frontend, de devs mobile maiores de 40 anos e de"
				+ " mulheres devs FullStack menores de 30 anos");
		System.out.println("\nTabela sexo: " + "\n1. Masculino" + "\n2. Feminino" + "\n3. Outros" );
		System.out.println("\nTabela categoria: " + "\n1. Backend" + "\n2. Frontend" + "\n3. Mobile" + "\n4. FullStack" );
		
		//Entrada de dados e tratamento
		while (continua.equalsIgnoreCase("Sim"))
		{
			System.out.print("\nQual é sua idade: ");
			idade = ler.nextInt();	
			System.out.print("Qual é seu sexo: ");
			sexo = ler.nextInt();	
			System.out.print("Qual é sua categoria: ");
			categoria = ler.nextInt();
			
			if (categoria == 1) 
			{
				backend ++;
			}
			if (categoria == 2 && sexo == 2) 
			{
				mulheresFrontend ++;
			}
			if (idade >= 40 && sexo == 1 && categoria == 3) 
			{
				devMob ++;
			}
			if (idade <= 30 && categoria == 4 && sexo == 2) 
			{
				mulheresFullstack ++;
			}
			
			System.out.print("\nDeseja continuar (sim ou não)? ");
			continua = ler.next();
		}
		
		//Saída de dados
		System.out.println("\nFinal da pesquisa:");
		System.out.println("Total de desenvolvedores backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras frontend: " + mulheresFrontend);
		System.out.println("Total de homens desenvolvedores mobile maior de 40 anos: " + devMob);
		System.out.println("Total de mulheres desenvolvedoras Fullstack menores de 30 anos: " + mulheresFullstack);
		
		
		ler.close();
		

	}

}
