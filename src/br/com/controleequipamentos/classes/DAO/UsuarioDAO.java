/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.classes.DAO;
import java.sql.*;
import br.com.controleequipamentos.classes.Usuario;
import br.com.controleequipamentos.conexaoBD.BancoDeDados;
import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author higor
 */
public class UsuarioDAO {
    
    Usuario usuario= new Usuario();
    
    public UsuarioDAO(){
        BancoDeDados.conecta();
    }
 
    
    
}
