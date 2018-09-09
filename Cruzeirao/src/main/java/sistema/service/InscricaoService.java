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
	/*
	private ArrayList<Inscricao> inscricoes = Dados.INSCRICOES;
	
	public List<Inscricao> getCampeonatos() {
		return inscricoes;
	}
	
	public void salvar(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
	public Inscricao getInscricaoByNome(int IdNumero) {
		for(int i=0; i< inscricoes.size(); i++)
			if(IdNumero == inscricoes.get(i).getNumero())
				return inscricoes.get(i);
		
		return null;
	}
	*/
}
