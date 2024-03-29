package br.com.controleequipamentos.classes.DAO;

import br.com.controleequipamentos.classes.Usuario;
import br.com.controleequipamentos.conexao.BD.BancoDeDados;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioDAO extends BancoDeDados {

    Usuario usuario = new Usuario();

    public UsuarioDAO() {
        BancoDeDados.conecta();
    }

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

    //select nomeequipamento from equipamentos,descricao where  equipamentos.idequipamento= descricao.idequipamento;
    //select nomeequipamento from equipamentos,descricao,manutencao where  equipamentos.idequipamento= descricao.idequipamento and descricao.idtombamento=manutencao.idtombamento;
    public boolean alterar(Usuario usu) {

        try {
            Statement st = conexao.createStatement();

            st.executeUpdate("UPDATE login SET senha='" + usu.getSenha() + "' WHERE idconta=" + usu.getIdConta());
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não alterados!");
            return false;
        }
    }

    
    public boolean excluir(Usuario usu) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("DELETE FROM login WHERE idconta=" + usu.getIdConta() + "");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
            return false;
        }

    }

    public Usuario recuperaDados(String nome) {
        Usuario usuario = new Usuario();
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM login WHERE usuario='" + nome + "'");
            resultado.first();

            usuario.setIdConta(resultado.getInt("idconta"));
            usuario.setNome(resultado.getString("nome"));
            usuario.setSenha(resultado.getString("senha"));
            usuario.setTipoUsuario(resultado.getString("tipousuario"));
            usuario.setUsuario(resultado.getString("usuario"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!" + ex);

        }
        return usuario;
    }

}

//
