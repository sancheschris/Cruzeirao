package sistema.mb;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Equipe;
import sistema.entidades.Inscricao;
import sistema.entidades.Usuario;
import sistema.service.EquipeService;
import sistema.service.InscricaoService;

@ManagedBean
@SessionScoped
public class EquipeMB {

	private EquipeService equipeService = new EquipeService();
	private InscricaoService inscricaoService = new InscricaoService();
	//private Equipe equipe = new Equipe();
	private Equipe novaEquipe = new Equipe();
	private Equipe equipeAtual;
	private Inscricao novaInscricao = new Inscricao();
	private List<Equipe> equipes;
	
	public String salvar() {
		novaEquipe = equipeService.salvar(novaEquipe);
		novaEquipe = new Equipe();
		return "menu";
	}
	
	public List <Equipe> getEquipes()
	{
		if(equipes == null)
			equipes = equipeService.getEquipes();
		return equipes;
	}
	
	public void remover(Equipe equipe) {
		equipeService.remover(equipe);
		equipes.remove(equipe);
	}
	
	
	public String verInscricao(Equipe equipe)
	{
		equipeAtual = equipeService.getEquipeById(equipe.getIdEquipe()); // chamar essa linha no listarCampeonato
		return "listarCampeonatoUsuario";
	}

	public Equipe getNovaEquipe() {
		return novaEquipe;
	}

	public void setNovaEquipe(Equipe novaEquipe) {
		this.novaEquipe = novaEquipe;
	}

	public Equipe getEquipeAtual() {
		return equipeAtual;
	}

	public void setEquipeAtual(Equipe equipeAtual) {
		this.equipeAtual = equipeAtual;
	}

	public Inscricao getNovaInscricao() {
		return novaInscricao;
	}

	public void setNovaInscricao(Inscricao novaInscricao) {
		this.novaInscricao = novaInscricao;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	
	
	
	
}
