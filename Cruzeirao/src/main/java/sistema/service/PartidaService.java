package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Partida;

public class PartidaService {
	
	private EntityManagerFactory emf;
	
	public PartidaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Partida partida) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(partida);
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Partida> getPartidas(){
		List<Partida> partidas;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select p from Partida p");
		partidas = q.getResultList();
		em.close();
		
		return partidas;
	}
	/*
	private ArrayList<Partida> partidas = Dados.PARTIDAS;
	
	public List<Partida> getPartidas() {
		return partidas;
	}
	
	public void salvar(Partida partida) {
		partidas.add(partida);
	}
	
	public Partida getCampeonatoByNome(int idNumero) {
		for(int i=0; i< partidas.size(); i++)
			if(idNumero == partidas.get(i).getNumero())
				return partidas.get(i);
		
		return null;
	}
	*/
}
