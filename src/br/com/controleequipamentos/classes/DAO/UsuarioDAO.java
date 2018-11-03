/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.classes.DAO;

import br.com.controleequipamentos.classes.Usuario;
import br.com.controleequipamentos.conexao.BD.BancoDeDados;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author higor
 */
public class UsuarioDAO extends BancoDeDados {

    Usuario usuario = new Usuario();

    public UsuarioDAO() {
        BancoDeDados.conecta();
    }

    /**
     * Método salvar
     *
     * @param usu
     * @return true se foi salvo ou false caso não seja
     */
    public boolean salvar(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM login WHERE usuario='" + usu.getUsuario() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado encontrado no sistema!");
                return false;

            } else {
                st.executeUpdate("INSERT INTO login VALUES(NULL, '" + usu.getNome() + "' , '" + usu.getUsuario() + "' , '" + usu.getSenha() + "' , '" + usu.getTipoUsuario() + "')");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }

    /**
     * Método acessar
     *
     * @param usu
     * @return true se o usuario e a senha correspondem ao cadastrado no sistema
     * ou false caso não esteja
     */
    public boolean acessar(Usuario usu) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM login WHERE usuario= '" + usu.getUsuario() + "' and senha='" + usu.getSenha() + "'");
            if (resultado.first()) {
                JOptionPane.showMessageDialog(null, "Acessado com sucesso! " + resultado.getString("tipousuario"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Acessado negado!");
            }

            return false;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

            return false;
        }
    }

    public boolean controleAcessoUsuarioSecretaria(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM login WHERE usuario='" + nome + "'");
            resultado.first();
            if (resultado.getString("tipousuario").equals("Secretária")) {
                return true;
            } else {
                return false;
            }
            /*
                Administrador
                Secretária
                Suporte
             */

        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean controleAcessoUsuarioSuporte(String nome) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM login WHERE usuario='" + nome + "'");
            resultado.first();
            if (resultado.getString("tipousuario").equals("Suporte")) {
                return true;
            } else {
                return false;
            }
            /*
                Administrador
                Secretária
                Suporte
             */

        } catch (SQLException ex) {
            return false;
        }
    }

}

//
