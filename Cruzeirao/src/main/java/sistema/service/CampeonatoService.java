package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import sistema.entidades.Campeonato;
import sistema.entidades.Usuario;

public class CampeonatoService {
	
	//private ArrayList<Campeonato> campeonatos = Dados.CAMPEONATOS;
	private EntityManagerFactory emf;
	
	public void salvar(Campeonato campeonato)
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(campeonato);
		em.getTransaction();
		em.close();
	}
	
	public void alterar(Campeonato campeonato) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Campeonato campeonato) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		campeonato = em.find(Campeonato.class, campeonato.getIdCampeonato());
		em.remove(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos()
	{
		List<Campeonato> campeonatos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c from Campeonato c");
		campeonatos = q.getResultList();
		em.close();
		
		return campeonatos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatoByNome(String nome) {
		List<Campeonato> campeonatos;
		
		EntityManager em = emf.createEntityManager();
		campeonatos = em.createNamedQuery("Campeonato.findNome").getResultList();
		em.setProperty("nome", nome);
		em.close();
		
		return campeonatos;
	}
	
	
	
	
	
	/*
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	
	public void salvar(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public Campeonato getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}
	*/
}
