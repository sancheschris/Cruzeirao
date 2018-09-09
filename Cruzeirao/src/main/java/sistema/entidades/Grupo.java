package sistema.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Grupo {
	private String nome;
	private Fase fase;
	@Transient
	private ArrayList<Rodada> rodadas = new ArrayList<>();
	@Id
	private int numero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
