package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Campeonato;
import sistema.entidades.Usuario;


public class UsuarioService {
	

	//private ArrayList <Usuario> usuarios = Dados.USUARIOS;
	private EntityManagerFactory emf;
	

	public UsuarioService()
	{
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
//	public void EntityClose() {
//		EntityManager em = emf2.createEntityManager();
//		em.close();
//	}
	
	public void salvar(Usuario usuario )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
//	
//	public void salvarCampeonato(Campeonato campeonato)
//	{
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(campeonato);
//		em.getTransaction();
//		em.close();
//	}
	
	public void alterar(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		usuario = em.find(Usuario.class, usuario.getIdUsuario());
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios()
	{
		List<Usuario> usuarios;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a from Usuario a");
		usuarios = q.getResultList();
		em.close();
		
		return usuarios;
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos()
	{
		List<Campeonato> campeonatos;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select c from Campeonato c");
		campeonatos = q.getResultList();
		
		return campeonatos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuariosId(String nome) {
		List<Usuario> usuarios;
		
		EntityManager em = emf.createEntityManager();
		em.setProperty("nome", nome);
		usuarios = em.createNamedQuery("Usuario.findId").getResultList();
		em.close();
		
		return usuarios;
	}
	
	
	public Usuario getCampeonatosUsuario(Usuario u) {
		EntityManager em = emf.createEntityManager();
		u = em.find(Usuario.class, u.getIdUsuario());
		u.getCampeonatos().size();
		em.close();
		return u;
	}
	
	public Usuario getUsuarioById(long id) {
		
		EntityManager em = emf.createEntityManager();
		Usuario u = em.find(Usuario.class, id);
	
		em.close();
		return u;
	}
	
public Usuario getUsuarioByNome(String nome) {
		
		EntityManager em = emf.createEntityManager();
		Usuario u = em.find(Usuario.class, nome);
		em.close();
		return u;
	}
	
//	public Usuario getUsuarioByCPF(String cpf) {
//		
//		EntityManager em = emf.createEntityManager();
//		Usuario u = em.find(Usuario.class, cpf);
//		return u;
//	}
	
}
