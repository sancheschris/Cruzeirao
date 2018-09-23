package sistema.entidades;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Fase {
	
	@Id
	private long idFase;
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	@Transient // verificar colecction ou embedded
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>(); 
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="fase")
	private static ArrayList<Grupo> grupos = new ArrayList<>();
	private int numero;
	
	public Fase() {
		super();
	}
	
	public long getIdFase() {
		return idFase;
	}

	public void setIdFase(long idFase) {
		this.idFase = idFase;
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
