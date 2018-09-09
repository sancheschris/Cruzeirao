package sistema.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partida {
	@Id
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante; // somente quando é arraylist
	private Date data;
	private Partida proxPartida;
	private Grupo grupo;
	private String relatoJuiz;
	private Inscricao[] inscricoes = {new Inscricao(), new Inscricao()};  // 0 ou 2 inscricoes
	
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
