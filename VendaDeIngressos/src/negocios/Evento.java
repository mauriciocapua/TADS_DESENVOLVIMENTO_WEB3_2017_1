package negocios;

import java.time.LocalDate;
import java.util.List;

public class Evento {

	int ID;
	String nome;
	LocalDate Data;
	String Local;
	List<Lugar> listaLugares;
	
	public Evento(){
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return Data;
	}

	public void setData(LocalDate data) {
		Data = data;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	public List<Lugar> getListaLugares() {
		return listaLugares;
	}

	public void setListaLugares(List<Lugar> listaLugares) {
		this.listaLugares = listaLugares;
	}

	
	
	
	
}
