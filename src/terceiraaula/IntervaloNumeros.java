package terceiraaula;

import java.util.Scanner;

public class IntervaloNumeros {

	public static void main(String[] args) {

		int numeroMenor, numeroMaior;
		
		Scanner ler = new Scanner(System.in);

		// Informações para o usuário
		System.out.println("Esse programa serve para encontrar os multiplos de 3 e 5 de um determinado intervalo.");

		// Entrada de dados:
		System.out.print("\nEntre com o primeiro valor do intervalo: ");
		numeroMenor = ler.nextInt();
		System.out.print("Entre com o segundo valor do intervalo: ");
		numeroMaior = ler.nextInt();
		
		// Tratamento de Dados
		if(numeroMenor < numeroMaior) {
			System.out.print("\nOs numeros multiplos de 3 e 5 são: ");
		}else {
			System.out.println("\nIntervalo inválido!");
		}
		
		for (numeroMenor = numeroMenor; numeroMenor <= numeroMaior; numeroMenor++ ) {
			if (numeroMenor % 3 == 0 && numeroMenor % 5 == 0) {
				System.out.print("\n" + numeroMenor);
			}	
		}
		
		ler.close();

		// Descobrir porque esse código está dando errado depois; 
		/*if (numeroMenor < numeroMaior) {
			for (contador = numeroMenor; contador <= numeroMaior; contador++) {
				if (numeroMenor % 3 == 0 && numeroMenor % 5 == 0) {
					System.out.println(numeroMenor + "é Número é multiplo de 3 e 5!");
				}
			}
		} else {
			System.out.println("\nIntervalo Inválido!");
		}*/

	}

}
