package testes;

import java.io.IOException;
import java.util.Scanner;

public class TestesFuncaoLambda 
{
	public static float calcular(TesteInterfaceFuncional om, float num1, float num2) 
	{
		return om.operation(num1, num2);
	}
	
	public static void main(String[] args) 
	{
		float number_1, number_2;
		int operation;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("________________________________________\n");
			System.out.println("        Calculadora Lambda");
			System.out.println("________________________________________\n");
			System.out.println("\t1. Multiplicação \n\t2. Divisão \n\t3. Soma \n\t4. Substração \n\t5. Sair\n");
			
			System.out.print("Digite o numero da operação que deseja fazer: ");
			operation = scanner.nextInt();
			
			switch(operation) 
			{
				case 1 ->
				{
					System.out.print("\nDigite o primeiro fator: ");
					number_1 = scanner.nextFloat();
					System.out.print("Digite o segundo fator: ");
					number_2 = scanner.nextFloat();
					System.out.println("Produto da multiplicação: " + 
										calcular((a, b) -> a * b, number_1, number_2) 
										+ "\n");
					keyPress();
				}
				case 2 -> 
				{
					System.out.print("\nDigite o divisor: ");
					number_1 = scanner.nextFloat();
					System.out.print("Digite o dividendo: ");
					number_2 = scanner.nextFloat();
					System.out.println("Quociente da divisão: " + 
										calcular((a, b) -> a / b, number_1, number_2));
					System.out.println("Resto da divisão: " + 
							calcular((a, b) -> a % b, number_1, number_2) 
							+ "\n");
					keyPress();
				}
				case 3 -> 
				{
					System.out.print("\nDigite a primeira parcela: ");
					number_1 = scanner.nextFloat();
					System.out.print("Digite a segunda parcela: ");
					number_2 = scanner.nextFloat();
					System.out.println("Total da soma: " + 
										calcular((a, b) -> a + b, number_1, number_2) 
										+ "\n");
					keyPress();
				}
				case 4 ->
				{
					System.out.print("\nDigite o minuendo: ");
					number_1 = scanner.nextFloat();
					System.out.print("Digite o subtraendo: ");
					number_2 = scanner.nextFloat();
					System.out.println("Diferença da subtração: " + 
										calcular((a, b) -> a - b, number_1, number_2) 
										+ "\n");
					keyPress();
				}
				case 5 -> 
				{
					System.exit(0);
					scanner.close();
				}
				default -> 
				{
					System.out.print("Você digitou uma operação Inválida");
				}
				
			}
		}	
	}
	
	public static void keyPress()
	{
		try 
		{
			System.out.println("Pressione enter para continuar...");
			System.in.read();
		}catch (IOException erroEntradaSaida) 
		{
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
