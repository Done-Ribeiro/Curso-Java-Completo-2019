package _11_TratamentoDeExcecoes.aula_07_ExercicioDeFixacao.model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
