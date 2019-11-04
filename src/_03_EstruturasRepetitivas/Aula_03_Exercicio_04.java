package _03_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_03_Exercicio_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			float divisao = 0;

			if (numero2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				divisao = (float) numero1 / numero2;
				System.out.printf("%.1f%n", divisao);
			}

		}

		sc.close();
	}

}
