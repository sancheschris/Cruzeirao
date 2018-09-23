package sistema.mb;



import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Campeonato;
import sistema.entidades.Categoria;
import sistema.entidades.Fase;
import sistema.service.CampeonatoService;


@ManagedBean
@SessionScoped
public class CampeonatoMB {

	private CampeonatoService campeonatoService = new CampeonatoService();
	private Campeonato novoCampeonato = new Campeonato();
	private Campeonato campeonatoAtual;
	private Categoria novaCategoria;
	
	public String salvar() {
		campeonatoService.salvar(novoCampeonato);
		novoCampeonato = new Campeonato();
		return "menu";
	}
	
	public List <Campeonato> getCampeonatos()
	{
		return campeonatoService.getCampeonatos();
	}

	public Campeonato getNovoCampeonato() {
		return novoCampeonato;
	}

	public void setNovoCampeonato(Campeonato novoCampeonato) {
		this.novoCampeonato = novoCampeonato;
	}

	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}

	public void setCampeonatoAtual(Campeonato campeonatoAtual) {
		this.campeonatoAtual = campeonatoAtual;
	}
	
	public String verCategoriasNome(String idNome) {
		campeonatoAtual = (Campeonato) campeonatoService.getCampeonatoByNome(idNome);
		return "listarCategoriaCampeonato";
	}
	
	public String verCategorias(Campeonato campeonato) {
		campeonatoAtual = (Campeonato) campeonatoService.getCampeonatoByNome(campeonato.getNome());
		return "listarCategoriaCampeonato";
	}
	/*
	public String verCategoriasNome(String idNome) {
		campeonatoAtual = campeonatoService.getCampeonatoByNome(idNome);
		return "listarCategoriaCampeonato";
	}
	
	public String verCategorias(Campeonato campeonato) {
		campeonatoAtual = campeonatoService.getCampeonatoByNome(campeonato.getNome());
		return "listarCategoriaCampeonato";
	}
	*/
	public String criarCategorias() {
		novaCategoria = new Categoria();
		return "cadastroCategoria";
	}
	
	public String salvarCategoria()
	{
		novoCampeonato.addCategorias(novaCategoria);
		novaCategoria.setCampeonato(novoCampeonato);
		return "listarCategoriaCampeonato";
	}

	public Categoria getNovaCategoria() {
		return novaCategoria;
	}

	public void setNovaCategoria(Categoria novacategoria) {
		this.novaCategoria = novacategoria;
	}	
}
