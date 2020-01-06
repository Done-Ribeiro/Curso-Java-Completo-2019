package _14_Generics_Set_Map.aula_06_Set_Parte_01.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

//		System.out.println(set.contains("Notebook"));
//		set.remove("Tablet");
//		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}
	}

}