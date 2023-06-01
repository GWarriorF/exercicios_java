package aula5;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ListandoElementosSet {

	public static void main(String[] args) {
		
		Integer print;
		Set<Integer> setNumerosAleatorios = new HashSet<Integer>();
		
		setNumerosAleatorios.add(2);
		setNumerosAleatorios.add(5);
		setNumerosAleatorios.add(1);
		setNumerosAleatorios.add(3);
		setNumerosAleatorios.add(4);
		setNumerosAleatorios.add(9);
		setNumerosAleatorios.add(7);
		setNumerosAleatorios.add(8);
		setNumerosAleatorios.add(10);
		setNumerosAleatorios.add(6);
		
		
		//Lista de numeros ordenadas pelo set:
		for(Iterator <Integer> iNumeros = setNumerosAleatorios.iterator(); iNumeros.hasNext();) 
		{
			print = iNumeros.next();
			System.out.println(print);
		}
	}

}
