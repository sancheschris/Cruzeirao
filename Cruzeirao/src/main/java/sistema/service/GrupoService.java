package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Grupo;

public class GrupoService {
	
	private ArrayList<Grupo> grupos = Dados.GRUPOS;
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void salvar(Grupo grupo) {
		grupos.add(grupo);
	}
	
	public Grupo getGrupoByNome(String idNome) {
		for(int i=0; i< grupos.size(); i++)
			if(idNome == grupos.get(i).getNome())
				return grupos.get(i);
		
		return null;
	}
}
