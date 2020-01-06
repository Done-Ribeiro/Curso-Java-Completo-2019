package _14_Generics_Set_Map.aula_08_Como_o_TreeSet_compara_os_elementos.application;

import java.util.Set;
import java.util.TreeSet;

import _14_Generics_Set_Map.aula_08_Como_o_TreeSet_compara_os_elementos.entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for (Product p : set) {
			System.out.println(p);
		}
	}

}
