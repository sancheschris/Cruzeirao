package sistema.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManagerFactory;

import org.primefaces.event.RowEditEvent;

import sistema.entidades.Campeonato;
import sistema.entidades.Equipe;
import sistema.entidades.Usuario;
import sistema.service.CampeonatoService;
import sistema.service.EquipeService;
import sistema.service.UsuarioService;


@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioService usuarioService = new UsuarioService();
	private CampeonatoService campeonatoService = new CampeonatoService();
	private EquipeService equipeService = new EquipeService();
	private Usuario novoUsuario = new Usuario();
	private Equipe novaEquipe;
	private Campeonato novoCampeonato = new Campeonato();
	private Usuario usuarioAtual;
	private List<Usuario> usuarios;
	private EntityManagerFactory emf2;
	
	// Edicao de um aluno na tabela
	public void onRowEdit(RowEditEvent event) {
		
		Usuario u = ((Usuario) event.getObject());
		usuarioService.alterar(u);
	}
	
	public void salvar() {
		novoUsuario = usuarioService.salvar(novoUsuario);
		
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
	
	public String verCampeonatos(Usuario usuario)
	{
		usuarioAtual = usuarioService.getCampeonatosUsuario(usuario);  // chamar essa linha no listarCampeonato
		return "listarCampeonatoUsuario";
	}
	
	public void getCampeonatos(Usuario usuario) {
		usuarioAtual = usuarioService.getCampeonatosUsuario(usuario);
	}
	
//	public String verCampeonatosCPF(String cpf)
//	{
//		usuarioAtual = usuarioService.getUsuarioByNome(cpf);
//		return "listarCampeonatoUsuario";
//	}
	
	
	public String verEquipes(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioById(usuario.getIdUsuario());
		return "listarEquipeUsuario";
	}
	
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
		equipeService.salvar(novaEquipe);
		usuarioAtual.addEquipes(novaEquipe);
		novaEquipe.setUsuario(usuarioAtual);
		return "listarEquipeUsuario";
	}
	
	
	public String salvarCampeonato()
	{
		campeonatoService.salvar(novoCampeonato);
		usuarioAtual.addCampeonatos(novoCampeonato);
		novoCampeonato.getUsuarios().add(usuarioAtual);
		novoCampeonato =  new Campeonato();
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
