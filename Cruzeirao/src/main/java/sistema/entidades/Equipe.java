package sistema.entidades;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Equipe {
	@Id
	private String nome;
	private Date dataFundacao;
	private String cidade;
	private Usuario usuario;
	@Transient
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // equipe tem 0 ou mais usuarios
	@Transient
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>(); // equipe realiza 0 ou mais inscriçoes

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
