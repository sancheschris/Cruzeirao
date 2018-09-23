package sistema.entidades;

import java.util.ArrayList;

public class PartidaFutebol extends Partida {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Gol> golsMandantes = new ArrayList<>();
	private ArrayList<Gol> golsVisitantes = new ArrayList<>();
	private ArrayList<Gol> golsPenaltesMandantes = new ArrayList<>();
	private ArrayList<Gol> golsPenaltesVisitantes = new ArrayList<>();
	private ArrayList<Cartao> cartoesMandante = new ArrayList<>();
	private ArrayList<Cartao> cartoesVisitante = new ArrayList<>();
	private ArrayList<Gol> gols = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
	private Gol g = new Gol(); // Composicao
	private Cartao c = new Cartao(); // Composicao 
	
	public PartidaFutebol() {
		super();
	}
	public ArrayList<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(ArrayList<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public ArrayList<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public ArrayList<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void setGolsPenaltesMandantes(ArrayList<Gol> golsPenaltesMandantes) {
		this.golsPenaltesMandantes = golsPenaltesMandantes;
	}
	public ArrayList<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void setGolsPenaltesVisitantes(ArrayList<Gol> golsPenaltesVisitantes) {
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	public ArrayList<Gol> getGols() {
		return gols;
	}
	public void setGols(ArrayList<Gol> gols) {
		this.gols = gols;
	}
	public ArrayList<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	public Gol getG() {
		return g;
	}
	
	public Cartao getC() {
		return c;
	}
	
}
