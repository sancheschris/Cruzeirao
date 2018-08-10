package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Partida;

public class PartidaService {
	
	private ArrayList<Partida> partidas = Dados.PARTIDAS;
	
	public List<Partida> getPartidas() {
		return partidas;
	}
	
	public void salvar(Partida partida) {
		partidas.add(partida);
	}
	
	public Partida getCampeonatoByNome(int idNumero) {
		for(int i=0; i< partidas.size(); i++)
			if(idNumero == partidas.get(i).getNumero())
				return partidas.get(i);
		
		return null;
	}
}
