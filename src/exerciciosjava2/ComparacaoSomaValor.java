package exerciciosjava2;

import java.util.Scanner;

public class ComparacaoSomaValor {
	
	public static void main(String[] args) {
		int parcela1, parcela2, comparacao, soma;
		
		Scanner leia = new Scanner(System.in);
		
		//Inforamções para o usuário
		System.out.println("Este programa tem a finalidade de comparar "
				+ "a soma de duas parcelas com um outro valor:");
		
		//Entrada de dados
		System.out.print("Insira o valor da primeira parcela da soma: ");
		parcela1 = leia.nextInt();
		
		System.out.print("Insira o valor da segunda parcela da soma: ");
		parcela2 = leia.nextInt();
		
		System.out.print("Insira o valor de comparação: ");
		comparacao = leia.nextInt();
		
		//Tratamento de dados
		soma = parcela1 + parcela2;
		
		if (soma > comparacao) {
			System.out.print("\nO valor da soma é " + soma + ", sendo maior que " + comparacao + ".");
		}
		else if(soma == comparacao) {
			System.out.print("\nO valor da soma é " + soma + ", sendo igual a " + comparacao + ".");
		}
		else {
			System.out.print("\nO valor da soma é " + soma + ", sendo menor que " + comparacao + ".");
		}
		
		leia.close();
	}
}
