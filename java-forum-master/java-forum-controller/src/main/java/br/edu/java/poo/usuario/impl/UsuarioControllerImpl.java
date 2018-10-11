package br.edu.java.poo.usuario.impl;

import br.edu.java.poo.usuario.UsuarioBusiness;
import br.edu.java.poo.usuario.UsuarioController;
import br.edu.java.poo.usuario.UsuarioDTO;

public class UsuarioControllerImpl implements UsuarioController {

    UsuarioBusiness usuarioBusiness = new UsuarioBusinessImpl();

    public UsuarioDTO buscarUsuario(UsuarioDTO usuarioDTO) {
        return usuarioBusiness.buscarUsuario(usuarioDTO);
    }
}
