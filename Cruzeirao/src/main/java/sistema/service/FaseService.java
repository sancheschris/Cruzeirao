package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
	
	/*
	private ArrayList<Fase> fases = Dados.FASES;
	
	public List<Fase> getFases() {
		return fases;
	}
	
	public void salvar(Fase fase) {
		fases.add(fase);
	}
	*/
	/*public Fase getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}*/
}
