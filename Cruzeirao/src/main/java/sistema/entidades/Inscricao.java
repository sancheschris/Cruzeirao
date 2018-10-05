package sistema.entidades;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Inscricao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long idInscricao;
	private long numero;
	private boolean pagamento;
	private boolean validada;
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria = new Categoria();
	@Transient
	private ArrayList<Partida> partidas = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="idEquipe")
	private Equipe equipe = new Equipe();
	
	public long getIdInscricao() {
		return idInscricao;
	}
	public void setIdInscricao(long idInscricao) {
		this.idInscricao = idInscricao;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
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
