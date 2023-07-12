package com.springboot.app.msoauth.services;

import com.springboot.app.msusuarioscommons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
