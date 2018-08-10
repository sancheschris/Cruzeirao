package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Inscricao;

public class InscricaoService {
	
	private ArrayList<Inscricao> inscricoes = Dados.INSCRICOES;
	
	public List<Inscricao> getCampeonatos() {
		return inscricoes;
	}
	
	public void salvar(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
	public Inscricao getInscricaoByNome(int IdNumero) {
		for(int i=0; i< inscricoes.size(); i++)
			if(IdNumero == inscricoes.get(i).getNumero())
				return inscricoes.get(i);
		
		return null;
	}
}
