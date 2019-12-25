package _11_TratamentoDeExcecoes.aula_06_Solucao_03_Boa.model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
