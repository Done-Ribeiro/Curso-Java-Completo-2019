package _13_Interfaces.aula_04_Herdar_Vs._CumprirContrato.model.entities;

import _13_Interfaces.aula_04_Herdar_Vs._CumprirContrato.model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
