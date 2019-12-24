package _10_Heranca_Polimorfismo.aula_03_Sobreposicao_PalavraSuper_AnotacaoOverride.entities;

import _10_Heranca_Polimorfismo.aula_03_Sobreposicao_PalavraSuper_AnotacaoOverride.entities.Account;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
