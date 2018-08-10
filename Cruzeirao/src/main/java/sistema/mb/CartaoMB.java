package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Cartao;

@ManagedBean
@SessionScoped

public class CartaoMB {

	private ArrayList<Cartao> lista = new ArrayList<>();
	
	private Cartao cartao = new Cartao();
	
	public void salvar() {
		lista.add(cartao);
		cartao = new Cartao();
	}
	
	public ArrayList<Cartao> getLista(){
		return lista;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public void setLista(ArrayList<Cartao > lista) {
		this.lista = lista;
	}
	
	
	
	

}
