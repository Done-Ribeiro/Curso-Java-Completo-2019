package _07_ComportamentoDeMemoria_Arrays_Listas.aula_05_ForEach.application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		// normal For
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------");
		
		// For each
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
