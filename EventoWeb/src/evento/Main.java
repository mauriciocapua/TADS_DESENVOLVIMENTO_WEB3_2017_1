package evento;


import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import modelos.Evento;

public class Main {

	public static void main(String[] args) throws Exception {
		Evento evento = new Evento();
		
		LocalDate lt = LocalDate.parse("1991-08-15");
		Date date = Date.valueOf(lt);
		System.out.println(date);
		
	}

}
