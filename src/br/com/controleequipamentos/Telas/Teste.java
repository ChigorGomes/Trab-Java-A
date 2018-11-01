/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.Telas;
import br.com.controleequipamentos.conexaoBD.Conexao;


/**
 *
 * @author higor
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao conexao= new Conexao();
        conexao.conecta();
    }
    
}
