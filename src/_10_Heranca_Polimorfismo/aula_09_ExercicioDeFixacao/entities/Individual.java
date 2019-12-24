package _10_Heranca_Polimorfismo.aula_09_ExercicioDeFixacao.entities;

public class Individual extends TaxPlayer {

	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
