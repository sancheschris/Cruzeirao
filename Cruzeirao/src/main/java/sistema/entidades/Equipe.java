package sistema.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Equipe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEquipe;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	private String cidade;
	@ManyToOne
	@JoinColumn(name="cpf")
	private Usuario usuario;
	@ManyToMany
	@JoinTable(name="TBL_UsuarioEquipe",
		joinColumns = @JoinColumn(name="idEquipe"),
		inverseJoinColumns = @JoinColumn(name="idUsuario"))
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // equipe tem 0 ou mais usuarios
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="equipe")
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>(); // equipe realiza 0 ou mais inscriçoes

	public long getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(long idEquipe) {
		this.idEquipe = idEquipe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuarioAtual) {
		this.usuario = usuarioAtual;
		
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
}
