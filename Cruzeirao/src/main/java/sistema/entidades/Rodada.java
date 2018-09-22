package sistema.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Rodada {
	@Id
	private long idRodada;
	private int numero;
	private Grupo grupo;
	@Transient
	private ArrayList<Partida> partidas  = new ArrayList<>();
	
	public long getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(long idRodada) {
		this.idRodada = idRodada;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	
}
