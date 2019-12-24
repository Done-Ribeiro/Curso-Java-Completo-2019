package _10_Heranca_Polimorfismo.aula_08_MetodosAbstratos.entities;

import _10_Heranca_Polimorfismo.aula_08_MetodosAbstratos.entities.enums.Color;

public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

}