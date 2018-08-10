package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Cartao;

public class CartaoService {
	
	private ArrayList<Cartao> cartoes = Dados.CARTOES;
	
	public List<Cartao> getCartoes() {
		return cartoes;
	}
	
	public void salvar(Cartao cartao) {
		cartoes.add(cartao);
	}
	
	/*public Cartao getCartaoByNome(String idNome) {
		for(int i=0; i< cartoes.size(); i++)
			if(idNome == cartoes.get(i).getNome())
				return cartoes.get(i);
		
		return null;
	}*/
}
