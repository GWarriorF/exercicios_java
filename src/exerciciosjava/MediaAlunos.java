package exerciciosjava;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) { 
		
		float nota1, nota2, nota3, nota4, somaDasNotas, mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva a nota do primeiro bimestre: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Escreva a nota do segundo bimestre: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Escreva a nota do terceiro bimestre: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Escreva a nota do quarto bimestre: ");
		nota4 = leia.nextFloat();
		
		somaDasNotas = nota1 + nota2 + nota3 + nota4;
		mediaFinal = somaDasNotas/4;
		
		System.out.print("Média do participante: " + mediaFinal);
		
	}

}
