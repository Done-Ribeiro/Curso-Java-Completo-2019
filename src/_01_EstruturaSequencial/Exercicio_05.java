package _01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2, calcularValor;
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		calcularValor = (numeroPeca1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", calcularValor);
		
		sc.close();
	}

}
