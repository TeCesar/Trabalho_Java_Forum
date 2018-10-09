package br.edu.java.poo.services.login;

import br.edu.java.poo.usuario.UsuarioController;
import br.edu.java.poo.usuario.UsuarioDTO;
import br.edu.java.poo.usuario.impl.UsuarioControllerImpl;

public class LoginService {
    UsuarioController usuarioController;

    public LoginService() {
        this.usuarioController = new UsuarioControllerImpl();
    }

    public boolean login(UsuarioDTO usuarioDTO) {
        boolean loginValido = usuarioController.buscarUsuario(usuarioDTO);
        if (loginValido) {
            return true;
        }
        return false;
    }

}
