package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_01_UmaExperienciaCom_Comparator.application;

import java.util.Comparator;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_01_UmaExperienciaCom_Comparator.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
