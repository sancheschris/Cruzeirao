package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Campeonato;

public class CampeonatoService {
	
	private ArrayList<Campeonato> campeonatos = Dados.CAMPEONATOS;
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	
	public void salvar(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public Campeonato getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}
}
