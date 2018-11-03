/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controleequipamentos.classes;

/**
 *
 * @author higor
 */
public class TipoEquipamentos {
    private int idEquipamentos;
    private String nomeEquipamento;

    public TipoEquipamentos(int idEquipamentos, String nomeEquipamento) {
        this.idEquipamentos = idEquipamentos;
        this.nomeEquipamento = nomeEquipamento;
    }

    
    
    public TipoEquipamentos(){}
    
    public int getIdEquipamentos() {
        return idEquipamentos;
    }

    public void setIdEquipamentos(int idEquipamentos) {
        this.idEquipamentos = idEquipamentos;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
    
    /**
     * Pega o nome do médico
     *
     * @return String nome do médico
     */
    @Override
    public String toString() {
        return this.nomeEquipamento;
    }
    
}
