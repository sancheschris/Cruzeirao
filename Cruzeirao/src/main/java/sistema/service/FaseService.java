package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Equipe;
import sistema.entidades.Fase;

public class FaseService {
	
	
	private EntityManagerFactory emf;
	
	public FaseService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Fase fase) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(fase);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Fase> getFases(){
		List<Fase> fases;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select f from Fase f");
		fases = q.getResultList();
		em.close();
		
		return fases;
	}
	
	public Fase getCampeonatoById(long id) {
		EntityManager em = emf.createEntityManager();
		Fase f = em.find(Fase.class, id);
		em.close();
		return f;
	}
}
