package exercicios1;

import java.util.Scanner;

public class DiferençaDeProdutos {

	public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4, produto1, produto2, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor da primeira multiplicação: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o valor da primeira multiplicação: ");
		numero2 = leia.nextFloat();
		
		produto1 = numero1 * numero2;
		
		System.out.print("Digite o valor da segunda multiplicação: ");
		numero3 = leia.nextFloat();
		
		System.out.print("Digite o valor da segunda multiplicação: ");
		numero4 = leia.nextFloat();
		
		produto2 = numero3 * numero4; 
		
		diferenca = produto1 - produto2;
		
		System.out.print("A diferença entre o produto das suas multiplicações é: " + diferenca);
		
		leia.close();
	}

}
