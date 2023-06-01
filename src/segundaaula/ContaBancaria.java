package segundaaula;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		int operacao;
		float saldo = 1000.00f, saque, deposito;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Este programa serve para você movimentar sua conta bancária");
		System.out.println("\nOperações que podem ser feitas" + "\n1. Saldo" + "\n2. Saque" + "\n3. Depósito");
		
		//Entrada de dados
		System.out.print("\nOperação à ser feita: ");
		operacao = ler.nextInt();
		
		if (operacao == 1) 
		{
			System.out.print("\nSeu saldo é: " + saldo);
		}else if (operacao == 2)
		{
			System.out.print("\nDigite o valor do saque: ");
			saque = ler.nextFloat();
			if (saque > 1000) 
			{
				System.out.print("Saldo insuficiente");	
			}else 
			{
				System.out.print("Novo saldo: "  + (saldo - saque));
			}
		}else if(operacao == 3) 
		{
			System.out.print("\nDigite o valor de depósito: ");
			deposito = ler.nextFloat();
			System.out.print("Novo saldo: " + (saldo + deposito));
		}else 
		{
			System.out.print("\nOperação Inválida");
		}
		
		ler.close();
		
	}

}
