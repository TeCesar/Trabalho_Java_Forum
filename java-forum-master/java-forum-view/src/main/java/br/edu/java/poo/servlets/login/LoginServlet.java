package br.edu.java.poo.servlets.login;

import br.edu.java.poo.services.login.LoginService;
import br.edu.java.poo.usuario.UsuarioDTO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private LoginService loginService = new LoginService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("nomeUsuario");
        String senha = req.getParameter("senha");

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setNomeConta(login);
        usuarioDTO.setSenha(senha);

        boolean logado = loginService.login(usuarioDTO);

        if (logado) {
            req.getSession().setAttribute("usuario.logado", usuarioDTO);
        } else {

        }
    }

}
