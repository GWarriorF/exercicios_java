package exercicios2;

import java.util.Scanner;

public class QualAnimal {

	public static void main(String[] args) {
		
		String caracteristica1, caracteristica2, caracteristica3; 
		
		Scanner ler = new Scanner(System.in);
		
		//Informações para o Usuário 
		System.out.println("Este programa vai descobrir qual anímal você escolheu");
		System.out.println("\nLista de Animais:" + "\n1. Águia;" + "\n2. Pomba;"
							+ "\n3. Pessoa;" + "\n4. Vaca;" + "\n5. Pulga;" + "\n6. Lagarta;" 
							+ "\n7. Sanguessuga;" + "\n8. Minhoca.");
		System.out.println("ATENÇÃO: CERTIFIQUE-SE DE ESCREVER DE FORMA CORRETA!");
		
		//Entrada de Dados
		System.out.println("\nResponda as características do seu animal:");
		System.out.print("O animal escolhido é vertebrado ou invertebrado? ");
		caracteristica1 = ler.next();
		
		System.out.print("O animal escolhido é uma ave, mamífero, inseto ou anelídeo? ");
		caracteristica2 = ler.next();
		
		System.out.print("O animal escolhido é carnívoro, herbívoro, onívoro ou hematófago? ");
		caracteristica3 = ler.next();
		
		//Tratamento de dados e saída
		if (caracteristica1.equalsIgnoreCase("Vertebrado") 
				&& caracteristica2.equalsIgnoreCase("Ave") 
				&& caracteristica3.equalsIgnoreCase("carnívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Àguia.");
		}else if (caracteristica1.equalsIgnoreCase("Vertebrado") 
				&& caracteristica2.equalsIgnoreCase("Ave") 
				&& caracteristica3.equalsIgnoreCase("Onívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Pomba.");
		}else if (caracteristica1.equalsIgnoreCase("Vertebrado") 
				&& caracteristica2.equalsIgnoreCase("Mamífero") 
				&& caracteristica3.equalsIgnoreCase("Onívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Pessoa.");
		}else if (caracteristica1.equalsIgnoreCase("Vertebrado") 
				&& caracteristica2.equalsIgnoreCase("Mamífero") 
				&& caracteristica3.equalsIgnoreCase("Herbívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Vaca.");
		}else if (caracteristica1.equalsIgnoreCase("Invertebrado") 
				&& caracteristica2.equalsIgnoreCase("Inseto") 
				&& caracteristica3.equalsIgnoreCase("Hematófago")) 
		{
			System.out.print("\nO animal escolhido foi uma Pulga.");
		}else if (caracteristica1.equalsIgnoreCase("Invertebrado") 
				&& caracteristica2.equalsIgnoreCase("Inseto") 
				&& caracteristica3.equalsIgnoreCase("Herbívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Lagarta.");
		}else if (caracteristica1.equalsIgnoreCase("Invertebrado") 
				&& caracteristica2.equalsIgnoreCase("Anelídeo") 
				&& caracteristica3.equalsIgnoreCase("Hematáfogo")) 
		{
			System.out.print("\nO animal escolhido foi uma Sanguessuga.");
		}else if (caracteristica1.equalsIgnoreCase("Invertebrado") 
				&& caracteristica2.equalsIgnoreCase("Anelídeo") 
				&& caracteristica3.equalsIgnoreCase("Onívoro")) 
		{
			System.out.print("\nO animal escolhido foi uma Minhoca.");
		}else{
				System.out.print("\nEsse animal não existe no nosso banco de dados.");
		}
		
		ler.close();	
		
	}

}
