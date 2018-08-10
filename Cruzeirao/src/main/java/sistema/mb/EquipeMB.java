package sistema.mb;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Equipe;

import sistema.service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeMB {

	private EquipeService equipeService = new EquipeService();
	private Equipe equipe = new Equipe();
	private Equipe novaEquipe;
	
	public String salvar() {
		equipeService.salvar(novaEquipe);
		novaEquipe = new Equipe();
		return "menu";
	}
	
	public List <Equipe> getEquipes()
	{
		return equipeService.getEquipes();
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
