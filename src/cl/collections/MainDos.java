package cl.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDos {

	public static void main(String[] args) {
		/*
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);

		
		numeros.forEach(System.out :: println);

		System.out.println("-------------");
		
		// los elementos tienen que ser multiplicado por 2 y lístelos
		
		List<Integer> numerosPorDos = numeros.stream().map( numero -> numero*2 ).collect(Collectors.toList());
		
		numerosPorDos.forEach(System.out :: println);
		*/
		
		

		List<Integer> numerosRandom = Arrays.asList(1,2,3,4,5);
		
		int suma = numerosRandom.stream().reduce(0, (sumador,elemento) -> {
			
			
			System.out.println("X: "+sumador);
			System.out.println("Y: "+elemento);
			
			int sumainterna = sumador+elemento;
			// x : ultimo cálculo existente, resultado de la respuesta anterior
			// y : elemento en el recorrido
			return sumainterna;
		});
		
		System.out.println(suma);
		

	}

}
