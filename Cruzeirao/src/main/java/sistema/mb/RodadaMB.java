package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Rodada;

@ManagedBean
@SessionScoped

public class RodadaMB {
	
	private ArrayList<Rodada> lista = new ArrayList<>();
		
		private Rodada rodada = new Rodada();
		
		public void salvar() {
			lista.add(rodada);
			rodada = new Rodada();
		}
		
		public ArrayList<Rodada> getLista(){
			return lista;
		}

		public Rodada getRodada() {
			return rodada;
		}

		public void setRodada(Rodada rodada) {
			this.rodada = rodada;
		}

		public void setLista(ArrayList<Rodada> lista) {
			this.lista = lista;
		}

}