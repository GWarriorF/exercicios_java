package exerciciosjava5;

import java.util.ArrayList;
import java.util.Scanner;

public class EncontrandoNumerosEmUmaCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
		Integer numerosUsuario, numeroPosicao = 0;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Esse programa serve para você encontrar o indice de um elemento escolhido dentro de uma lista" 
							+ "\n");
		
		//Entrada de dados
		for(int i = 0; i <=9; i++) 
		{
			System.out.print("Insira o " + (i+1) + "° número da lista: ");
			numerosUsuario = ler.nextInt();
			numerosAleatorios.add(numerosUsuario);
		}
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		numeroPosicao = ler.nextInt();
		
		//Saída de dados
		if (numerosAleatorios.contains(numeroPosicao)) {
			System.out.println("\nO número " + numeroPosicao + " está localizado na posição: " 
								+ numerosAleatorios.indexOf(numeroPosicao));
		}else 
		{
			System.out.println("\nO número " + numeroPosicao + "não foi encontrado!");
		}
		
		ler.close();
			
	}

}
