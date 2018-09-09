package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Rodada;

public class RodadaService {
	
	private EntityManagerFactory emf;
	
	public RodadaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Rodada rodada) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(rodada);
		em.getTransaction();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Rodada> getRodadas(){
		List<Rodada> rodadas;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select r from Rodada r");
		rodadas = q.getResultList();
		em.close();
		
		return rodadas;
	}
	/*
	private ArrayList<Rodada> rodadas = Dados.RODADAS;
	
	public List<Rodada> getCampeonatos() {
		return rodadas;
	}
	
	public void salvar(Rodada rodada) {
		rodadas.add(rodada);
	}
	
	public Rodada getCampeonatoByNome(int idNumero) {
		for(int i=0; i< rodadas.size(); i++)
			if(idNumero == rodadas.get(i).getNumero())
				return rodadas.get(i);
		
		return null;
	}
	*/
}
