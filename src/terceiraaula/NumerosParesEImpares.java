package terceiraaula;

import java.util.Scanner;

public class NumerosParesEImpares {

	public static void main(String[] args) {
		
		int contador, numero, impar = 0, par = 0;
		
		Scanner ler = new Scanner(System.in);
		
		//Informações pra o usuário
		System.out.println("Programa criado para filtrar a quantidade de números ímpares e pares." + "\n");
		
		//Entrada de dados e tratamento de dados
		for(contador = 1; contador <= 10; contador ++) 
		{
			System.out.print("Digite o " + contador + "° número: ");
			numero = ler.nextInt();
			if (numero % 2 == 0 ) 
			{
				par = par + 1;
			}else {
				impar = impar + 1;
			}
		}
		
		//Saída de dados
		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
		
		ler.close();

	}

}
