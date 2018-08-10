package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.PartidaFutebol;

@ManagedBean
@SessionScoped

public class PartidaFutebolMB {
	
	private ArrayList<PartidaFutebol> lista = new ArrayList<>();
	private PartidaFutebol partidafutebol = new PartidaFutebol();
		
		public void salvar() {
			lista.add(partidafutebol);
			partidafutebol = new PartidaFutebol();
		}
		
		public ArrayList<PartidaFutebol> getLista(){
			return lista;
		}

		public PartidaFutebol getPartidaFutebol() {
			return partidafutebol;
		}

		public void setPartidaFutebol(PartidaFutebol partidafutebol) {
			this.partidafutebol = partidafutebol;
		}

		public void setLista(ArrayList<PartidaFutebol> lista) {
			this.lista = lista;
		}

}
