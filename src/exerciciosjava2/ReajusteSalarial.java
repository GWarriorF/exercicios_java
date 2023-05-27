package exerciciosjava2;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		
		String colaborador; 
		Float salario;
		int cargo; 
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o usuário
		System.out.println("Este programa serve para calcular seu reajuste salarial.");
		System.out.println("\nListade cargos: " + "\n1. Gerente;" + "\n2. Vendedor;" + 
							"\n3. Supervisor;" + "\n4. Motorista;" + "\n5. Estoquista" 
							+ "\n6. Técnico de T.I.");
		
		// Entrada de dados
		System.out.print("\nDigite o número do seu cargo: ");
		cargo = ler.nextInt();
		System.out.print("Digite seu salário atual: ");
		salario = ler.nextFloat();	
		System.out.print("Digite seu nome: ");
		colaborador = ler.nextLine();
		
		// Tratamento de dados
		switch(cargo) {
		case 1:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Gerente;" 
								+ "\nNovo Salário: " + (salario + (salario * 0.1)));
		case 2:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Vendedor;" 
					+ "\nNovo Salário: " + (salario + (salario * 0.07)));
		case 3:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Supervisor;" 
					+ "\nNovo Salário: " + (salario + (salario * 0.09)));
		case 4:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Motorista;" 
					+ "\nNovo Salário: " + (salario + (salario * 0.06)));
		case 5:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Estoquista;" 
					+ "\nNovo Salário: " + (salario + (salario * 0.05)));
		case 6:
			System.out.print("\nColaborador: " + colaborador +";" + "\nCargo: Técnico de T.I.;" 
					+ "\nNovo Salário: " + (salario + (salario * 0.08)));
			
		}
		
		ler.close();
	
	}

}
