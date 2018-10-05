package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Inscricao;

public class InscricaoService {
	
	private EntityManagerFactory emf;
	
	public InscricaoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Inscricao inscricao) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(inscricao);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inscricao> getInscricao(){
		List<Inscricao> inscricoes;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select i from Inscricao i");
		inscricoes = q.getResultList();
		em.close();
		
		return inscricoes;
	}
	
	public Inscricao getInscricaoById(long id) {
		EntityManager em = emf.createEntityManager();
		Inscricao i = em.find(Inscricao.class, id);
		em.close();
		return i;
	}
}
