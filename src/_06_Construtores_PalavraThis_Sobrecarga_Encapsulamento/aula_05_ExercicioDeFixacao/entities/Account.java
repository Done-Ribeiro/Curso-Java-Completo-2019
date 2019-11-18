package _06_Construtores_PalavraThis_Sobrecarga_Encapsulamento.aula_05_ExercicioDeFixacao.entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);	// encapsulation: protect constructor to future changes in business rules
	}

	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
