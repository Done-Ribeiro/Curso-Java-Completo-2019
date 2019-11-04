package _03_EstruturasRepetitivas;

import java.util.Scanner;

public class Aula_03_Exercicio_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;

			System.out.println(i + " " + quadrado + " " + cubo);
		}

		sc.close();
	}

}
