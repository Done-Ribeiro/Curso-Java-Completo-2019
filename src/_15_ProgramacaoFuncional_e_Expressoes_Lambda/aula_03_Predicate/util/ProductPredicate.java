package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_03_Predicate.util;

import java.util.function.Predicate;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_03_Predicate.entities.Product;

// Predicate Implementation
public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
