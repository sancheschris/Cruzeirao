package sistema.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Inscricao {
	@Id
	private Long numero;
	private boolean pagamento;
	private boolean validada;
	private Categoria categoria = new Categoria();
	@Transient
	private ArrayList<Partida> partidas = new ArrayList<>();
	private Equipe equipe = new Equipe();
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isValidada() {
		return validada;
	}
	public void setValidada(boolean validada) {
		this.validada = validada;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
}
