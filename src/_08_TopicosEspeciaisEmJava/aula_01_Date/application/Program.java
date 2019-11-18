package _08_TopicosEspeciaisEmJava.aula_01_Date.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		// create a date with custom format
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// set time-zone to GMT format
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf1.parse("17/11/2019");
		Date y2 = sdf2.parse("17/11/2019 12:00:17");

		// create a date with current time
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());

		/*
		 * expected return is 01/01/1970 - (UTC), but in Brazil we have 3 hours less
		 * will then return: 31/12/1969 21:00:00
		 */
		Date x3 = new Date(0L);

		/*
		 * expected return: 01/01/1970 05:00:00, but in Brazil we have 3 hours less will
		 * then return: 01/01/1970 02:00:00
		 */
		Date x4 = new Date(1000L * 60 * 60 * 5);

		// date in format ISO 8601 : date defined in format UTC
		Date x5 = Date.from(Instant.parse("2019-11-17T12:00:17Z"));

		System.out.println(y1);
		System.out.println(y2);

		
		// return with java standard
		System.out.println("----------");
		System.out.println("return with java standard");
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("x5: " + x5);
		
		// return with sff2 -> time-zone local
		System.out.println("----------");
		System.out.println("return with sff2 -> time-zone local");
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("x5: " + sdf2.format(x5));
		
		// return with sdf3 -> time-zone (GMT)
		System.out.println("----------");
		System.out.println("return with sdf3 -> time-zone (GMT)");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("x5: " + sdf3.format(x5));
	}

}
