package br.edu.java.poo.usuario.impl;

import br.edu.java.poo.usuario.UsuarioBusiness;
import br.edu.java.poo.usuario.UsuarioDAO;
import br.edu.java.poo.usuario.UsuarioDTO;

public class UsuarioBusinessImpl implements UsuarioBusiness {

    UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    public boolean buscarUsuario(UsuarioDTO usuarioDTO) {
        return usuarioDAO.buscarUsuario(usuarioDTO);
    }
}
