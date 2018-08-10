package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Rodada;

public class RodadaService {
	
	private ArrayList<Rodada> rodadas = Dados.RODADAS;
	
	public List<Rodada> getCampeonatos() {
		return rodadas;
	}
	
	public void salvar(Rodada rodada) {
		rodadas.add(rodada);
	}
	
	public Rodada getCampeonatoByNome(int idNumero) {
		for(int i=0; i< rodadas.size(); i++)
			if(idNumero == rodadas.get(i).getNumero())
				return rodadas.get(i);
		
		return null;
	}
}
