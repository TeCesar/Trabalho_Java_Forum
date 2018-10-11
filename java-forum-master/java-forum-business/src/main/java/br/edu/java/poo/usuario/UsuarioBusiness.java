package br.edu.java.poo.usuario;

import br.edu.java.poo.usuario.impl.UsuarioDAOImpl;

public interface UsuarioBusiness {
    UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    UsuarioDTO buscarUsuario(UsuarioDTO usuarioDTO);

}
