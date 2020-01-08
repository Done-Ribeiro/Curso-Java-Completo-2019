package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_05_Function.util;

import java.util.function.Function;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_05_Function.entities.Product;

// Function Implementation
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
