package _01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		areaTrianguloRetangulo = (A * C) / 2;
		areaCirculo = (C * C * 3.14159);
		areaTrapezio = (A + B) / 2.0 * C;
		areaQuadrado = (B * B);
		areaRetangulo = (A * B);
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("TRIANGULO: %.3f%n", areaCirculo);
		System.out.printf("TRIANGULO: %.3f%n", areaTrapezio);
		System.out.printf("TRIANGULO: %.3f%n", areaQuadrado);
		System.out.printf("TRIANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
