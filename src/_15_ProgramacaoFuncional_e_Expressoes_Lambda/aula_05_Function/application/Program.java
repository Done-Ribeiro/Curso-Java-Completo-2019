package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_05_Function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_05_Function.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Function Implementation
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// Method reference static
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// Method reference non static
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// Declared lambda expression
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// Inline lambda expression
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}

}
