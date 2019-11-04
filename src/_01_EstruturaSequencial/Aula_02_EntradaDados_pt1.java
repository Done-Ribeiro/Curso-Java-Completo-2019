package _01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_02_EntradaDados_pt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z);
		
		System.out.printf("Voce digitou: %.2f%n", z);
		Locale.setDefault(Locale.US);
		System.out.printf("Voce digitou: %.2f%n", z);
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Voce digitou: " + c);
		
		sc.close();
	}

}
