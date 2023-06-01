package aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenandoCores {

	public static void main(String[] args) {
		
		ArrayList<String> coresUsuario = new ArrayList<String>();
		String cores, continua = "Sim"; 

		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Este programa serve para ordenar as cores escritas pelo usuário" + "\n");
		
		//Entrada de dados
		while(continua.equalsIgnoreCase("Sim")) {
			System.out.print("Digite uma cor: ");
			cores = ler.next();
			coresUsuario.add(cores);
			
			System.out.print("Deseja acrescentar mais uma cor (sim ou não)? ");
			continua = ler.next();
		}
		
		//Saída de dados
		System.out.println("\nLista de todas as cores: " + coresUsuario);
		coresUsuario.sort(null);
		System.out.println("Lista ordenada de todas as cores" + coresUsuario);
		
		ler.close();
		
	}

}
