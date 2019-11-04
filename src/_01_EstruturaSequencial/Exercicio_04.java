package _01_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario, horasTrabalhadas;
		double valorHora, calcularSalario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		calcularSalario = valorHora * horasTrabalhadas;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, calcularSalario);
		
		sc.close();
	}

}
