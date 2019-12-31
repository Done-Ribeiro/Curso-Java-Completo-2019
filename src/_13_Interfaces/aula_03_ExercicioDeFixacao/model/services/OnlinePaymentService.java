package _13_Interfaces.aula_03_ExercicioDeFixacao.model.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
