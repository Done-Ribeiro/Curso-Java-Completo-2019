package _02_EstruturaCondicional;

import java.util.Scanner;

public class Aula_01_Exercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();
	}
}
