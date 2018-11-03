/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.classes.DAO;

import java.sql.*;
import br.com.controleequipamentos.classes.Descricao;
import br.com.controleequipamentos.conexao.BD.BancoDeDados;
import javax.swing.JOptionPane;

/**
 *
 * @author higor
 */
public class DescricaoDAO extends BancoDeDados {

    Descricao descricao = new Descricao();
    int idEquipa=0;
    public DescricaoDAO() {
        BancoDeDados.conecta();
    }


    public int buscaEquipamento(String busca) {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT idequipamento FROM equipamentos WHERE nomeequipamento='" + busca + "'");
            resultado.first();
            idEquipa = resultado.getInt("idequipamento");
            return idEquipa;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "equipamento não encontrado!");

        }
        return idEquipa;
    }
    
    
    public boolean salvar(Descricao desc) {
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO descricao VALUES(NULL," + desc.getIdEquipamento() + ",'" + desc.getDescricao() + "' ,'" + desc.getDataDesc() + "' , '" + desc.getLocalDesc() + "')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }
    
    

}
