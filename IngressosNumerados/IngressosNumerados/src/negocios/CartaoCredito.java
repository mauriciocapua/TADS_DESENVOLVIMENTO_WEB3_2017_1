package negocios;

import java.time.LocalDate;

public class CartaoCredito {

	String Nome;
	String NumeroCC;
	int CV;
	Bandeira bandeira;
	LocalDate DataVencimento;
	
	public CartaoCredito(){
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNumeroCC() {
		return NumeroCC;
	}

	public void setNumeroCC(String numeroCC) {
		NumeroCC = numeroCC;
	}

	public int getCV() {
		return CV;
	}

	public void setCV(int cV) {
		CV = cV;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public LocalDate getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		DataVencimento = dataVencimento;
	}
	
	
	
}

