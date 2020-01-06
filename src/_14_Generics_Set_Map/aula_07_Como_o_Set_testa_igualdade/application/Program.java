package _14_Generics_Set_Map.aula_07_Como_o_Set_testa_igualdade.application;

import java.util.HashSet;
import java.util.Set;

import _14_Generics_Set_Map.aula_07_Como_o_Set_testa_igualdade.entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		Product prod = new Product("Notebook", 1200.0);

		System.out.println(set.contains(prod));
	}

}
