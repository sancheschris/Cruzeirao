package sistema.entidades;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Cartao {

	@Enumerated(EnumType.ORDINAL)
	private Tipo tipo;

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	/*
	private String amarelo;
	private String vermelho;
	
	public Cartao() {
		super();
	}
	public String getAmarelo() {
		return amarelo;
	}
	public void setAmarelo(String amarelo) {
		this.amarelo = amarelo;
	}
	public String getVermelho() {
		return vermelho;
	}
	public void setVermelho(String vermelho) {
		this.vermelho = vermelho;
	}
	*/
	
}
