package sistema.mb;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Fase;
import sistema.entidades.Grupo;
import sistema.entidades.Rodada;
import sistema.service.GrupoService;

@ManagedBean
@SessionScoped
public class GrupoMB {
	
	private GrupoService grupoService = new GrupoService();
	private Grupo novoGrupo = new Grupo();
	private Fase novaFase;
	private Rodada novaRodada;
	
	public String salvar() {
		grupoService.salvar(novoGrupo);
		novoGrupo = new Grupo();
		return "menu";
	}
	
	public List <Grupo> getGrupos(){
		return grupoService.getGrupos();
	}
	
	public String criarFases() {
		novaFase = new Fase();
		return "fase";
	}
	
	public String criarRodadas() {
		novaRodada = new Rodada();
		return "rodada";
	}

	public Grupo getNovoGrupo() {
		return novoGrupo;
	}

	public void setNovoGrupo(Grupo novoGrupo) {
		this.novoGrupo = novoGrupo;
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}

	public Rodada getNovaRodada() {
		return novaRodada;
	}

	public void setNovaRodada(Rodada novaRodada) {
		this.novaRodada = novaRodada;
	}
}
