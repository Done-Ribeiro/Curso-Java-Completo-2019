package _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_04_Consumer.util;

import java.util.function.Consumer;

import _15_ProgramacaoFuncional_e_Expressoes_Lambda.aula_04_Consumer.entities.Product;

// Consumer Implementation
public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
