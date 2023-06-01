package primeiraaula;

import java.util.Scanner;

public class CalculoSalario2 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o valor recebido pelo adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite o valor recebido pelas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Digite o valor de que foi descontado: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5 ) - descontos;
		
		System.out.print("\nSeu salário liquido é: " + salarioLiquido);
		
		leia.close();

	}

}
