package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Categoria;

public class CategoriaService {
	
	//private ArrayList<Categoria> categorias = Dados.CATEGORIAS;
	
	private EntityManagerFactory emf;
	
	public CategoriaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Categoria categoria) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(){
		List<Categoria> categorias;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c from Categoria c ");
		categorias = q.getResultList();
		em.close();
		
		return categorias;
	}
	
	/*
	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void salvar(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public Categoria getCategoriaByNome(String idNome) {
		for(int i=0; i< categorias.size(); i++)
			if(idNome == categorias.get(i).getNome())
				return categorias.get(i);
		
		return null;
	}
*/	
}
