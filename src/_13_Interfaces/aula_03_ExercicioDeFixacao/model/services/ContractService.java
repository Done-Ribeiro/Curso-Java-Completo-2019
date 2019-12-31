package _13_Interfaces.aula_03_ExercicioDeFixacao.model.services;

import java.util.Calendar;
import java.util.Date;

import _13_Interfaces.aula_03_ExercicioDeFixacao.model.entities.Contract;
import _13_Interfaces.aula_03_ExercicioDeFixacao.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.onlinePaymentService = paymentService;
	}

	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			Date date = addMonths(contract.getDate(), i);
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			contract.addInstallment(new Installment(date, fullQuota));
		}
	}

}
