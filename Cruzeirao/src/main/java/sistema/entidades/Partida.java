package sistema.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Partida implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long idPartida;
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante; // somente quando é arraylist
	@Temporal(TemporalType.DATE)
	private Date data;
	private Partida proxPartida;
	private Grupo grupo;
	private Rodada rodada;
	private String relatoJuiz;
	private Inscricao[] inscricoes = {new Inscricao(), new Inscricao()};  // 0 ou 2 inscricoes
	
	public long getIdPartida() {
		return idPartida;
	}
	public void setIdPartida(long idPartida) {
		this.idPartida = idPartida;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public Rodada getRodada() {
		return rodada;
	}
	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	public Inscricao[] getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(Inscricao[] inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	
}
