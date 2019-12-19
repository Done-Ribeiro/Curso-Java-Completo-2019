package _09_Enumeracoes_Composicao.aula_01_Enumeracoes.application;

import java.util.Date;

import _09_Enumeracoes_Composicao.aula_01_Enumeracoes.entities.Order;
import _09_Enumeracoes_Composicao.aula_01_Enumeracoes.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PANDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		// instances a String to a type ENUM
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}

}
