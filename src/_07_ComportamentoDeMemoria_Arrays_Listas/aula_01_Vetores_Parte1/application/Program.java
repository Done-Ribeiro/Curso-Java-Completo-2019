package _07_ComportamentoDeMemoria_Arrays_Listas.aula_01_Vetores_Parte1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// primitive "objects"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

		sc.close();
	}

}
