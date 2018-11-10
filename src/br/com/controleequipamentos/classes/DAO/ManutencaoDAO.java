package br.com.controleequipamentos.classes.DAO;

import br.com.controleequipamentos.classes.Manutencao;
import br.com.controleequipamentos.classes.Usuario;
import br.com.controleequipamentos.conexao.BD.BancoDeDados;
import java.sql.*;
import javax.swing.JOptionPane;

public class ManutencaoDAO extends BancoDeDados {

    Manutencao manutencao = new Manutencao();
    Usuario usuario= new Usuario();
    UsuarioDAO usuarioDAO= new UsuarioDAO();
    public ManutencaoDAO() {
        BancoDeDados.conecta();
    }

    public boolean salvarDefeito(Manutencao manutencao, int idTombamento, int loginSolicitou) {

        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO manutencao VALUES(NULL," + idTombamento + ",'" + manutencao.getDescricaoDefeito() + "', '" + manutencao.getDataDefeito() + "',NULL," + loginSolicitou + ",NULL,NULL,'" + manutencao.getStatus() + "')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar consulta \n" + ex);
            return false;
        }
    }

    public Manutencao recuperaDados(int idmanutencao) {
        
        try {
            Statement st = conexao.createStatement();
            ResultSet resultado = st.executeQuery("SELECT * FROM manutencao  WHERE idmanutencao=" + idmanutencao);
            resultado.first();
           manutencao.setIdManutencao(Integer.parseInt(resultado.getString("idmanutencao")));
            manutencao.setIdTombamento(Integer.parseInt(resultado.getString("idtombamento")));
            manutencao.setDescricaoDefeito(resultado.getString("descricaodefeito"));
            manutencao.setDataDefeito(resultado.getString(("datadefeito")));
            manutencao.setLoginSolicitante(Integer.parseInt(resultado.getString("idloginsolicitou")));
            manutencao.setStatus(resultado.getString(("status")));

         

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código de manutencao não encontrado!");
            return null;
        }
        return manutencao;
    }
    
      public boolean alterar(Manutencao manu) {

        try {
            Statement st = conexao.createStatement();

            st.executeUpdate("UPDATE manutencao SET descricaosolucao='" + manu.getDescricaoSolucao()+"', idloginsolucionou="+manu.getLoginSolucionador() +", dataconserto='"+manu.getDataConserto()+"', status='"+manu.getStatus()+"' WHERE idmanutencao=" + manu.getIdManutencao());
            JOptionPane.showMessageDialog(null, "Manutencao feito com sucesso!");

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados não alterados!");
            return false;
        }
    }
    
    

}
