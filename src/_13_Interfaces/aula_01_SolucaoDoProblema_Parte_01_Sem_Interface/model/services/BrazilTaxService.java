package _13_Interfaces.aula_01_SolucaoDoProblema_Parte_01_Sem_Interface.model.services;

public class BrazilTaxService {

	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

}
