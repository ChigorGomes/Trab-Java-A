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
public class Manutencao {
    private int idManutencao;
    private int idTombamento;
    private String descricaoDefeito;
    private String data;
    private int idStatus;
    private String descricaoSolucao;
    private int loginSolicitante;
    private int loginSolucionador;
    
    public Manutencao(){
    }

    public int getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public int getIdTombamento() {
        return idTombamento;
    }

    public void setIdTombamento(int idTombamento) {
        this.idTombamento = idTombamento;
    }

    public String getDescricaoDefeito() {
        return descricaoDefeito;
    }

    public void setDescricaoDefeito(String descricaoDefeito) {
        this.descricaoDefeito = descricaoDefeito;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescricaoSolucao() {
        return descricaoSolucao;
    }

    public void setDescricaoSolucao(String descricaoSolucao) {
        this.descricaoSolucao = descricaoSolucao;
    }

    public int getLoginSolicitante() {
        return loginSolicitante;
    }

    public void setLoginSolicitante(int loginSolicitante) {
        this.loginSolicitante = loginSolicitante;
    }

    public int getLoginSolucionador() {
        return loginSolucionador;
    }

    public void setLoginSolucionador(int loginSolucionador) {
        this.loginSolucionador = loginSolucionador;
    }
    
}
