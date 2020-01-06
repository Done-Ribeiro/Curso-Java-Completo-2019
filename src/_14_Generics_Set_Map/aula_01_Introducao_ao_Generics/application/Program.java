package _14_Generics_Set_Map.aula_01_Introducao_ao_Generics.application;

import java.util.Scanner;

import _14_Generics_Set_Map.aula_01_Introducao_ao_Generics.services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}

}
