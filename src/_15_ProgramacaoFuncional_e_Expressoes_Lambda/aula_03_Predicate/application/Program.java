package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_03_Predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_03_Predicate.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Predicate Implementation
//		list.removeIf(new ProductPredicate());

		// Method reference static
//		list.removeIf(Product::staticProductPredicate);

		// Method reference non static
//		list.removeIf(Product::nonStaticProductPredicate);

		// Declared lambda expression
//		double min = 100.0;
//		Predicate<Product> pred = p -> p.getPrice() >= min;
//		list.removeIf(pred);

		// Inline lambda expression
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
