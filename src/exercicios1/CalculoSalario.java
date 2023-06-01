package exercicios1;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o seu abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.print("\nSeu salário é: " + novosalario);
		
		leia.close();

	}

}
