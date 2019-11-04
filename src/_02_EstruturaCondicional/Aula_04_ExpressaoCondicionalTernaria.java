package _02_EstruturaCondicional;

public class Aula_04_ExpressaoCondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	}

}
