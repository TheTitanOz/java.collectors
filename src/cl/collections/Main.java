package cl.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		String [] limpiar = { "Java", "RoR", "Go" };
		
		list.add("Java");
		list.add("Scala");
		list.add("Kotlin");
		list.add("PHP");
		list.add("JavaScript");
		list.add("RoR");
		list.add("Python");
		list.add("PHP");
		
		/*
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			
			String elemento = it.next();
			
			System.out.println(elemento);
		}
		System.out.println("----------");
		
		for (int i =0; i<limpiar.length; i+=1) {
			if(list.remove(limpiar[i])) {
				System.out.println("Se eliminó "+limpiar[i]);
			} else {

				System.out.println("No existe en la lista "+limpiar[i]);
			}
		}
		
		System.out.println("----------");

		it = list.iterator();
		
		while (it.hasNext()) {
			
			String elemento = it.next();
			
			System.out.println(elemento);
		}

		System.out.println("----------");
		System.out.println(list.indexOf("PHP"));
		System.out.println(list.lastIndexOf("PHP"));
		
		*/
		
		
		// String -> arreglo de char
		//String text = "algo";
		//System.out.println(text.indexOf('l'));
		

		// arreglo normal
		list.forEach(System.out :: println);
		list.forEach((el) -> {
			System.out.println("ALGO");
			System.out.println(el+" hola");
			System.out.println("ALGO MAS");
		}); // (el) -> sysout(el)
		System.out.println("---------");
		// map, para crear un arreglo virtual
		list.stream().map( item -> item.toUpperCase() ).forEach(System.out :: println);
		
		list.stream().map( item -> {

			System.out.println("ALGO");
			System.out.println(item);
			System.out.println("ALGO MAS");
			
			return item.toUpperCase();
		} ).forEach(System.out :: println);		
		
		System.out.println("---------");
		// filter, para reducir mi arreglo base a una condición
		list.stream().filter( item -> item.toUpperCase().indexOf('A') > -1 ).forEach(System.out :: println);
		
	}

}
