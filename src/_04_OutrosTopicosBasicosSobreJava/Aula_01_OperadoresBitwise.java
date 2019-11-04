package _04_OutrosTopicosBasicosSobreJava;

import java.util.Scanner;

public class Aula_01_OperadoresBitwise {

	public static void main(String[] args) {

//		int numero1 = 89;
//		int numero2 = 60;
//
//		System.out.println(numero1 & numero2);
//		System.out.println(numero1 | numero2);
//		System.out.println(numero1 ^ numero2);

		Scanner sc = new Scanner(System.in);

		int mask = 0b00100000; // 32 em binario
		int number = sc.nextInt();
		if ((number & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}

		sc.close();
	}

}
