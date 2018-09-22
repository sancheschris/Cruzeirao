package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.entidades.Usuario;


public class UsuarioService {
	

	//private ArrayList <Usuario> usuarios = Dados.USUARIOS;
	private EntityManagerFactory emf;

	public UsuarioService()
	{
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Usuario usuario )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
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
}
