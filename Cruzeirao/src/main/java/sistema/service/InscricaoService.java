package sistema.service;

import java.util.List;

import sistema.dao.InscricaoDAO;
import sistema.entidades.Inscricao;

public class InscricaoService {

	InscricaoDAO inscricaoDAO = new InscricaoDAO();
	//PartidaDAO
	
	
	public Inscricao salvar(Inscricao inscricao) {
		inscricao = inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();
		return inscricao;
	}
	
	public List<Inscricao> getInscricao()
	{
		List<Inscricao> list = inscricaoDAO.getAll(Inscricao.class);
		inscricaoDAO.closeEntityManager();
		return list;
	}
	
	public Inscricao getInscricaoById(long id)
	{
		Inscricao u;
		u = inscricaoDAO.getById(Inscricao.class, id);
		return u;
	}
	
	public void alterar(Inscricao inscricao) {
		inscricaoDAO.save(inscricao);
		inscricaoDAO.closeEntityManager();
	}
	
	public void remover(Inscricao inscricao) {
		inscricao = inscricaoDAO.getById(Inscricao.class, inscricao.getIdInscricao());
		inscricaoDAO.remove(inscricao);
		inscricaoDAO.closeEntityManager();
	}
}
