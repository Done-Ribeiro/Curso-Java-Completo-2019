package _07_ComportamentoDeMemoria_Arrays_Listas.aula_04_Boxing_Unboxing_WrapperClasses.application;

public class Program {

	public static void main(String[] args) {

		// boxing
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		// unboxing
		int y = (int) obj;
		System.out.println(y);
		
		// wrapper classes (Integer...)
		Integer object = x;
		int z = object * 2;
		System.out.println(z);
	}

}
