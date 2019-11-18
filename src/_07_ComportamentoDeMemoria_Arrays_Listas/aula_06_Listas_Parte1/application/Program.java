package _07_ComportamentoDeMemoria_Arrays_Listas.aula_06_Listas_Parte1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// add in list
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// add in list with index
		list.add(2, "Marco");

		// return size of list
		System.out.println(list.size());

		// return all elements of list
		for (String x : list) {
			System.out.println(x);
		}

		// remove element by compare of Strings
//		list.remove("Anna");

		// remove element by index
//		list.remove(1);

		// remove element by predicate (lambda predicate function)
		System.out.println("----------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		// return element position in list
		System.out.println("----------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// when element is not found returns -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		// lambda operation with type List<> = result is a filter by the letter 'A'
		System.out.println("----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		// find by the first name with the letter 'A' (with base in predicate)
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
