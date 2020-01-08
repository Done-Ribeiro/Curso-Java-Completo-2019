package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_04_Consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_04_Consumer.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Predicate Implementation
//		list.forEach(new PriceUpdate());

		// Method reference static
//		list.forEach(Product::staticPriceUpdate);

		// Method reference non static
//		list.forEach(Product::nonStaticPriceUpdate);

		// Declared lambda expression
//		double factor = 1.1;
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//		list.forEach(cons);

		// Inline lambda expression
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}

}
