package sistema.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.entidades.Campeonato;
import sistema.entidades.Equipe;
import sistema.entidades.Usuario;
import sistema.service.UsuarioService;


@ManagedBean
@ViewScoped
public class UsuarioMB {
	
	private UsuarioService usuarioService = new UsuarioService();
	private Usuario novoUsuario = new Usuario();
	private Equipe novaEquipe;
	private Campeonato novoCampeonato;
	private Usuario usuarioAtual;
	private List<Usuario> usuarios;
	
	// Edicao de um aluno na tabela
	public void onRowEdit(RowEditEvent event) {
		
		Usuario u = ((Usuario) event.getObject());
		usuarioService.alterar(u);
	}
	
	/*
	public String salvar() {
		usuarioService.salvar(novoUsuario);
		novoUsuario = new Usuario();
		return "menu";
	}
	
	*/
	
	public void salvar() {
		usuarioService.salvar(novoUsuario);
		
		if(usuarios != null) {
			usuarios.add(novoUsuario);
		}
		
		novoUsuario = new Usuario();
	}
	
	// REtorna a lista de alunos para a tabela 
	public List <Usuario> getUsuarios()
	{
		if(usuarios == null)
			usuarios = usuarioService.getUsuarios();
		
		return usuarios;
		
	}
	
	public void remover(Usuario usuario) {
		usuarioService.remover(usuario);
		usuarios.remove(usuario);
	}
	
	/*
	public String verEquipesCPF(String cpf)
	{
		usuarioAtual = usuarioService.getUsuarios();
		return "listarEquipeUsuario";
	}
	
	
	public String verEquipes(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario.getCpf());
		return "listarEquipeUsuario";
	}
	
	
	public String verCampeonatosCPF(String cpf)
	{
		usuarioAtual = usuarioService.getUsuarioId(cpf);
		return "listarCampeonatoUsuario";
	}
	
	
	public String verCampeonatos(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario.getCpf());
		return "listarCampeonatoUsuario";
	}
	*/
	
	public String criarEquipes()
	{
		novaEquipe = new Equipe();
		return "cadastroEquipe";
	}
	
	public String criarCampeonatos()
	{
		novoCampeonato = new Campeonato();
		return "cadastroCampeonato";
	}
	

	public String salvarEquipe()
	{
		usuarioAtual.addEquipes(novaEquipe);
		novaEquipe.setUsuario(usuarioAtual);
		return "listarEquipeUsuario";
	}
	
	
	public String salvarCampeonato()
	{
		usuarioAtual.addCampeonatos(novoCampeonato);
		novoCampeonato.setUsuario(usuarioAtual);
		return "listarCampeonatoUsuario";
	}
	
	public Usuario getNovoUsuario() {
		return novoUsuario;
	}


	public void setNovoUsuario(Usuario novoUsuario) {
		this.novoUsuario = novoUsuario;
	}


	public Equipe getNovaEquipe() {
		return novaEquipe;
	}

	public void setNovaEquipe(Equipe novaEquipe) {
		this.novaEquipe = novaEquipe;
	}
	
	public Campeonato getNovoCampeonato() {
		return novoCampeonato;
	}
	
	public void setNovoCampeonato(Campeonato novocampeonato) {
		this.novoCampeonato = novocampeonato;
	}


	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}


	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	
	
	
}
