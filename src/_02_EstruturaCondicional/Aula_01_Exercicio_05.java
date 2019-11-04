package _02_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula_01_Exercicio_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		float valor;
		float contaPagar;
		
		if (codigo == 1) {
			valor = 4;
		}
		else if (codigo == 2) {
			valor = 4.5f;
		}
		else if (codigo == 3) {
			valor = 5;
		}
		else if (codigo == 4) {
			valor = 2;
		}
		else {
			valor = 1.5f;
		}
		
		contaPagar = valor * quantidade;
		
		System.out.printf("Total: R$ %.2f\n", contaPagar);
		
		sc.close();
	}
}
