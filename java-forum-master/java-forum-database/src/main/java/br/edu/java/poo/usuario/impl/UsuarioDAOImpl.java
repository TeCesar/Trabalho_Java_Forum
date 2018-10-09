package br.edu.java.poo.usuario.impl;

import br.edu.java.poo.conexao.SQLConnectionProvider;
import br.edu.java.poo.usuario.UsuarioDAO;
import br.edu.java.poo.usuario.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAOImpl implements UsuarioDAO {

    public boolean buscarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioDTO usuarioBusca = new UsuarioDTO();
        try (Connection connection = SQLConnectionProvider.openConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM usuario WHERE usuario_nomeConta = '" + usuarioDTO.getNomeConta() + "'" +
                    " AND usuario_senha = '" + usuarioDTO.getSenha() + "'");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                usuarioDTO.setId(resultSet.getInt("usuario_id"));
                usuarioDTO.setTipoAcesso(resultSet.getString("usuario_tipoAcesso"));
            }
            return true;

        } catch (SQLException e) {
            System.out.println("Falha na conexao");
        }
        return false;
    }

}
