package teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import WebServices.VendaIngressosWebService;
import classes.Evento;
import classes.Lugar;

public class teste {

	public static void main(String[] args) {
		
		Evento event = new Evento();
		Lugar lug = new Lugar();
		List<Lugar> listaLugar = new ArrayList<>();
		
		
		event.setId(3);
		event.setNome("Festa de São João");
		event.setData(LocalDate.of(2017, Month.JUNE, 24));
		event.setLocal("Bairro Junção");
		for (int i = 0; i < 20; i++) {
			lug.setNumero(i);
			lug.setStatus("LIVRE");
			lug.setValor(12.00);
			lug.setLocal("Ao Redor da Fogueira");
			listaLugar.add(lug);
		}
		event.setListaLugares(listaLugar);
		
		VendaIngressosWebService viws = new VendaIngressosWebService();
		try {
			viws.incluiEvento(event, LocalDateTime.of(LocalDate.of(2017, Month.JUNE, 01), LocalTime.of(9, 0)), LocalDateTime.of(LocalDate.of(2017, Month.JUNE, 24), LocalTime.of(9, 0)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
