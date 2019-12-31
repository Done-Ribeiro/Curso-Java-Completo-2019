package _13_Interfaces.aula_07_Default_Methods.application;

import java.util.Locale;
import java.util.Scanner;

import _13_Interfaces.aula_07_Default_Methods.services.BrazilInterestService;
import _13_Interfaces.aula_07_Default_Methods.services.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Mounths: ");
		int months = sc.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);

		System.out.println("Payment after: " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		sc.close();
	}

}
