package _03_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_03_Exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double media = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
