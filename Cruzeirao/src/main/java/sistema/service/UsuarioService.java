package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.entidades.Usuario;


public class UsuarioService {
	

	private ArrayList <Usuario> usuarios = Dados.USUARIOS;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void salvar(Usuario usuario )
	{
		usuarios.add(usuario);
	}
	
	public Usuario getUsuarioId(String idUsuario) {
		
		for(int i=0; i< usuarios.size(); i++)
			if(idUsuario == usuarios.get(i).getCpf())
				return usuarios.get(i);
		
		return null;
	}

}
