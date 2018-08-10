package sistema.entidades;
import java.util.ArrayList;
import java.util.Date;


public class Fase {
	
	private Date dataInicio;
	private Date dataFim;
	private Categoria categoria;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>(); 
	private static ArrayList<Grupo> grupos = new ArrayList<>();
	private int numero;
	
	public Fase() {
		super();
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public ArrayList<Categoria> getCategoriass() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categoria) {
		this.categorias = categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public static ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	
	public static void setGrupos(ArrayList<Grupo> grupos) {
		Fase.grupos = grupos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
}
