package exercicios5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncontrandoNumerosSet {

	public static void main(String[] args) 
	{
		Set<Integer> numerosAleatorios = new HashSet<Integer>();
		Integer numeroUsuario; 	
		
		Scanner ler = new Scanner(System.in);
		
		numerosAleatorios.add(2);
		numerosAleatorios.add(5);
		numerosAleatorios.add(1);
		numerosAleatorios.add(3);
		numerosAleatorios.add(4);
		numerosAleatorios.add(9);
		numerosAleatorios.add(7);
		numerosAleatorios.add(8);
		numerosAleatorios.add(10);
		numerosAleatorios.add(6);
		
		//Informações para o usuário
		System.out.println("Este programa serve para conferir se exite um número idêntico dentro do conjunto");
		
		//Tratamento de dados
		do 
		{
			//Entrada de dados
			System.out.print("\nDigite um número: ");
			numeroUsuario = ler.nextInt();
			
			//Saída de dados
			if (numerosAleatorios.contains(numeroUsuario))
			{
				System.out.println("O número " + numeroUsuario + " foi encontrado!!");
			}else 
			{
				System.out.println("O número " + numeroUsuario + " não foi encontrado!!");
				System.out.println("Fim do programa");
			}
		}while(numerosAleatorios.contains(numeroUsuario));
		
		ler.close();
	}

}
