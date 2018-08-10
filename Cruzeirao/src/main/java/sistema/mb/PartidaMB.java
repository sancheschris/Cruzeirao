package sistema.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Grupo;
import sistema.entidades.Inscricao;
import sistema.entidades.Partida;
import sistema.service.PartidaService;

@ManagedBean
@SessionScoped
public class PartidaMB {
	
	private PartidaService partidaService = new PartidaService();
	private Partida novaPartida = new Partida();
	private Inscricao novaInscricao;
	private Grupo novoGrupo;
	
	public String salvar() {
		partidaService.salvar(novaPartida);
		novaPartida = new Partida();
		return "menu";
	}
	
	public List <Partida> getPartidas(){
		return partidaService.getPartidas();
	}
	
	public String criarInscricao() {
		novaInscricao = new Inscricao();
		return "cadastroPartida";
	}
	
	public String criarGrupo() {
		novoGrupo = new Grupo();
		return "cadastroGrupo";
	}

	public Partida getNovaPartida() {
		return novaPartida;
	}

	public void setNovaPartida(Partida novaPartida) {
		this.novaPartida = novaPartida;
	}

	public Inscricao getNovaInscricao() {
		return novaInscricao;
	}

	public void setNovaInscricao(Inscricao novaInscricao) {
		this.novaInscricao = novaInscricao;
	}

	public Grupo getNovoGrupo() {
		return novoGrupo;
	}

	public void setNovoGrupo(Grupo novoGrupo) {
		this.novoGrupo = novoGrupo;
	}

	
}