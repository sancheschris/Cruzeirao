package sistema.entidades;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rodada implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long idRodada;
	private int numero;
	@ManyToOne
	@JoinColumn(name="idGrupo")
	private Grupo grupo;
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="rodada")
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
