package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Equipe;

public class EquipeService {
	
	private ArrayList<Equipe> equipes = Dados.EQUIPES;
	
	public List<Equipe> getEquipes() {
		return equipes;
	}
	
	public void salvar(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public Equipe getEquipeByNome(String idNome) {
		for(int i=0; i< equipes.size(); i++)
			if(idNome == equipes.get(i).getNome())
				return equipes.get(i);
		
		return null;
	}
}
