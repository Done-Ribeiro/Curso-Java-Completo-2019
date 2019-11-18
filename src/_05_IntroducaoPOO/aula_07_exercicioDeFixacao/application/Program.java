package _05_IntroducaoPOO.aula_07_exercicioDeFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import _05_IntroducaoPOO.aula_07_exercicioDeFixacao.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(amount, dollarPrice));

		sc.close();
	}

}
