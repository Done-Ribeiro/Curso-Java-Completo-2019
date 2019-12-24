package _10_Heranca_Polimorfismo.aula_02_Upcasting_Downcasting.application;

import _10_Heranca_Polimorfismo.aula_02_Upcasting_Downcasting.entities.Account;
import _10_Heranca_Polimorfismo.aula_02_Upcasting_Downcasting.entities.BusinessAccount;
import _10_Heranca_Polimorfismo.aula_02_Upcasting_Downcasting.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		System.out.println(acc);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
