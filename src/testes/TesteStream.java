package testes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream 
{
	public static void main(String[] args) 
	{
		//Cria uma lista
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numerosDesordenados = Arrays.asList(3, 1, 2, 7, 6, 5, 8, 4, 9, 10);
		
		//Guarda o que têm na lista em uma Stream 
		Stream<Integer> numerosStream = numeros.stream();
		
		//Cria uma Stream com números já dentro
		Stream<Integer> novosNumerosStream = Stream.of(10,11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
		//Lista com itens repetidos
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
									"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//Criação de Lista para teste
		List<String> filmes = Arrays.asList("500 dias com ela", "Tudo em Todo o Lugar ao Mesmo Tempo",
											"Super Mario", "Senhor dos Anéis", "homem formiga 3", "Stan Lee", 
											"Star Wars IV", "Star Wars V", "Star Wars VI");
		
		//Realizando Operações com Stream método map, utilizando pipeline e collectors
		List<Integer>numerosAoCubo = numeros.stream()
								   	 .map(x -> x*x*x)
									 .collect(Collectors.toList());
		System.out.println("\nNumeros elevados ao Cubo: " + numerosAoCubo);
		
		//Realizando filtragem de números pares
		List<Integer> numerosPares = numeros.stream()
		        				 .filter(x -> x%2==0)
		        				 .collect(Collectors.toList());

		System.out.println("\nExibir apenas os Numeros Pares: " + numerosPares);
		 
		//Ordenando uma lista
		List<Integer> numerosOrdenadosAsc = numerosDesordenados.stream()
															   .sorted()
															   .collect(Collectors.toList());

		System.out.println("\nExibir os Numeros em Ordem Crescente: " + numerosOrdenadosAsc);
		
		//Apaga os itens repetidos de uma lista
		List<String> estadosSemRepeticao = estados.stream()
												.distinct()
												.collect(Collectors.toList());
				     
		System.out.println("\nExibir os Estados sem repetição: " + estadosSemRepeticao);
		
		//Conta os itens de uma operação
		long numeroEstadosTerminaComO = estados.stream()
		        .filter(x-> x.toString().endsWith("o"))
		        .count();

		System.out.println("\nNúmero de Estados cujo nome terminam com a letra O: " + numeroEstadosTerminaComO);
		
		//Verifica se uma condição é verdadeira ou falsa para todos os itens da lista
		boolean todosEstadosContemRio = estados.stream()
				.allMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nTodos os Estados contém a palavra Rio? " + todosEstadosContemRio);
		
		//Verifica se uma condição é verdadeira ou falsa para Alguns itens da lista
		boolean algumEstadoContemRio = estados.stream()
				.anyMatch(x -> x.toString().contains("Rio"));

		System.out.println("\nPelo menos um Estado contém a palavra Rio? " + algumEstadoContemRio);
		
		//Faz a listagem dos itens que fizeram uma operação
		System.out.println("\nEstados cujo nome iniciam com a letra S:");
		
		estados.stream()
		       .filter(x-> x.toString().startsWith("S"))
		       .forEach(System.out::println);
		

		
	}
}
