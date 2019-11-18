package _05_IntroducaoPOO.aula_06_MembrosEstaticos_Versao_02.application;

import java.util.Locale;
import java.util.Scanner;

import _05_IntroducaoPOO.aula_06_MembrosEstaticos_Versao_02.util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Calculator calculator = new Calculator();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calculator.circumference(radius);

		double v = calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);

		sc.close();
	}

}
