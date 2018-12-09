package sistema.service;

import java.util.List;

import sistema.dao.EquipeDAO;
import sistema.dao.InscricaoDAO;
import sistema.entidades.Equipe;
import sistema.entidades.Inscricao;
import sistema.entidades.Usuario;

public class EquipeService {

	EquipeDAO equipeDAO = new EquipeDAO();
	InscricaoDAO inscricaoDAO = new InscricaoDAO();
	
	public Equipe salvar(Equipe equipe) {
		equipe = equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
		return equipe;
	}
	
	public List<Equipe> getEquipes()
	{
		List<Equipe> list = equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return list;
	}
	
	public List<Inscricao> getInscricao()
	{
		List<Inscricao> list = inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}
	

	
	public void alterar(Equipe equipe) {
		equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
	}
	
	public void remover(Equipe equipe) {
		equipe = equipeDAO.getById(Equipe.class, equipe.getIdEquipe());
		equipeDAO.remove(equipe);
		equipeDAO.closeEntityManager();
	}
	

	public Equipe getEquipeById(long id) {
		Equipe e;
		e = equipeDAO.getById(Equipe.class, id);
		return e;
	}

}
