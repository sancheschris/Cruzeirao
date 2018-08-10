package sistema.mb;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.entidades.Fase;

@ManagedBean
@SessionScoped

public class FaseMB {
	
	private ArrayList<Fase> lista = new ArrayList<>();
		
		private Fase fase = new Fase();
		
		public void salvar() {
			lista.add(fase);
			fase = new Fase();
		}
		
		public ArrayList<Fase> getLista(){
			return lista;
		}

		public Fase getFase() {
			return fase;
		}

		public void setFase(Fase fase) {
			this.fase = fase;
		}

		public void setLista(ArrayList<Fase> lista) {
			this.lista = lista;
		}

}