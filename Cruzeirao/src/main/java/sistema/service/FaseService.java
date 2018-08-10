package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Fase;

public class FaseService {
	
	private ArrayList<Fase> fases = Dados.FASES;
	
	public List<Fase> getFases() {
		return fases;
	}
	
	public void salvar(Fase fase) {
		fases.add(fase);
	}
	
	/*public Fase getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}*/
}
