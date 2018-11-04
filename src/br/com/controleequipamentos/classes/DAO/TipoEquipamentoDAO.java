/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.classes.DAO;

import br.com.controleequipamentos.classes.TipoEquipamentos;
import br.com.controleequipamentos.conexao.BD.BancoDeDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author higor
 */
public class TipoEquipamentoDAO extends BancoDeDados {

    int idEquipamento = 0;
    int idTomba=0;
    TipoEquipamentos tipoEquipamentos = new TipoEquipamentos();

    public TipoEquipamentoDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvar(TipoEquipamentos equipamentos) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM equipamentos WHERE nomeequipamento='" + equipamentos.getNomeEquipamento() + "'");

            if (resultado.first() == true) {
                JOptionPane.showMessageDialog(null, "Nome do Equipamento já se encontra no sistema!");
                return false;

            } else {
                st.executeUpdate("INSERT INTO equipamentos VALUES(NULL, '" + equipamentos.getNomeEquipamento() + "')");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
            return false;
        }

    }

    public Vector<TipoEquipamentos> mostraEquipamentos() {

        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM equipamentos ORDER BY nomeequipamento");

            Vector listaEquipam = new Vector();
            while (resultado.next()) {
                int codigo = resultado.getInt("idequipamento");
                String nome = resultado.getString("nomeequipamento");

                TipoEquipamentos equipamentos = new TipoEquipamentos(codigo, nome);

                listaEquipam.add(equipamentos);
            }
            return listaEquipam;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int recuperaIdEquipamento(int idTombamento) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM descricao  WHERE idtombamento=" + idTombamento);
            if (resultado.first() == true) {
                idEquipamento = resultado.getInt("idequipamento");

            } else {
                return 0;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Equipamento não encontrado!");

        }
        return idEquipamento;
    }

    public TipoEquipamentos recuperaNomeEquipamento(int idEq) {
        TipoEquipamentos auxTipoEquipamentos = new TipoEquipamentos();
        int auxIdEquipamento = recuperaIdEquipamento(idEq);
        try {
            Statement st = conexao.createStatement();
            System.out.println(idEquipamento);
            ResultSet resultado = st.executeQuery("SELECT  nomeequipamento FROM equipamentos,descricao WHERE equipamentos.idequipamento=" + auxIdEquipamento);
            resultado.first();
            auxTipoEquipamentos.setNomeEquipamento(resultado.getString("nomeequipamento"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Equipamento não encontrado!" );
            return null;

        }
        return auxTipoEquipamentos;
    }
    
     public int recuperaIdTombamento(int idTombamento) {
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM descricao  WHERE idtombamento=" + idTombamento);
            if (resultado.first() == true) {
                idTomba = resultado.getInt("idtombamento");

            } else {
                return 0;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Equipamento não encontrado!");

        }
        return idEquipamento;
    }

}
