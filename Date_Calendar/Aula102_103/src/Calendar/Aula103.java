package Calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Aula103 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//hora que foi repassada
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//add 4 horas ao tempo dado
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		//apos add 4 horas
		System.out.println(sdf.format(d));
		
		
		//OBTENDO UMA UNIDADE DE TEMPO
		int minutes = cal.get(Calendar.MINUTE);
		//acrescentando +1 pq mês começa de 0
		int month = 1 + cal.get(Calendar.MONTH); 
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
