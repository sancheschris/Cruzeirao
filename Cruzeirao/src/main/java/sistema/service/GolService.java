package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Gol;

public class GolService {
	
	private ArrayList<Gol> gols = Dados.GOLS;
	
	public List<Gol> getGols() {
		return gols;
	}
	
	public void salvar(Gol gol) {
		gols.add(gol);
	}
	
	/*public Gol getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}*/
}
