package sistema.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Gol;

@ManagedBean
@SessionScoped

public class GolMB {
	
	private ArrayList<Gol> lista = new ArrayList<>();
		
		private Gol gol = new Gol();
		
		public void salvar() {
			lista.add(gol);
			gol = new Gol();
		}
		
		public ArrayList<Gol> getLista(){
			return lista;
		}

		public Gol getGol() {
			return gol;
		}

		public void setGol(Gol gol) {
			this.gol = gol;
		}

		public void setLista(ArrayList<Gol> lista) {
			this.lista = lista;
		}

}
