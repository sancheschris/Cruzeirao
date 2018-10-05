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
}
