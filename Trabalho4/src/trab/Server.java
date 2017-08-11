package trab;

import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Server {

	@WebMethod(operationName = "obtemRegiao")
	@WebResult(name = "regiao")
	public String obtemRegiao(@WebParam(name = "text") String string) {
		if (string == null) {
			return ("sem valor");
		} else {
			switch (string.toUpperCase()) {
			case ("RS"):
				return ("Sul");
			case ("PR"):
				return ("Sul");
			case ("SC"):
				return ("Sul");

			case ("MG"):
				return ("Sudeste");
			case ("ES"):
				return ("Sudeste");
			case ("RJ"):
				return ("Sudeste");
			case ("SP"):
				return ("Sudeste");

			case ("MS"):
				return ("Centro-Oeste");
			case ("GO"):
				return ("Centro-Oeste");
			case ("MT"):
				return ("Centro-Oeste");
			case ("DF"):
				return ("Centro-Oeste");

			case ("MA"):
				return ("Nordeste");
			case ("PI"):
				return ("Nordeste");
			case ("CE"):
				return ("Nordeste");
			case ("RN"):
				return ("Nordeste");
			case ("PB"):
				return ("Nordeste");
			case ("PE"):
				return ("Nordeste");
			case ("AL"):
				return ("Nordeste");
			case ("SE"):
				return ("Nordeste");
			case ("BA"):
				return ("Nordeste");

			case ("RO"):
				return ("Norte");
			case ("AC"):
				return ("Norte");
			case ("AM"):
				return ("Norte");
			case ("RR"):
				return ("Norte");
			case ("PA"):
				return ("Norte");
			case ("AP"):
				return ("Norte");
			case ("TO"):
				return ("Norte");

			default:
				return ("não válido " + string);
			}
		}
	}

	@WebMethod(operationName = "obtemUF")
	@WebResult(name = "UF")
	public String[] obtemUF(@WebParam(name = "text") String regiao) {
		String[] uf = { "erro" };

		if (regiao == null) {
			return uf;
		} else {
			switch (regiao.toUpperCase()) {
			case "SUL":
				uf = new String[] { "RS", "SC", "PR" };
				return uf;
			case "SUDESTE":

				uf = new String[] { "MG", "ES", "RJ", "SP" };
				return uf;

			case "CENTRO-OESTE":
				uf = new String[] { "MS", "GO", "MT", "DF" };
				return uf;

			case "NORDESTE":
				uf = new String[] { "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA" };
				return uf;

			case "NORTE":
				uf = new String[] { "RO", "AC", "AM", "RR", "PA", "AP", "TO" };
				return uf;

			default:
				return uf;
			}
		}

	}

}