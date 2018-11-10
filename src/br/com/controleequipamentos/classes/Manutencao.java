package br.com.controleequipamentos.classes;

public class Manutencao {

    private int idManutencao;
    private int idTombamento;
    private String descricaoDefeito;
    private String dataDefeito;
    private String descricaoSolucao;
    private int loginSolicitante;
    private int loginSolucionador;
    private String dataConserto;
    private String status;

    public String getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(String dataConserto) {
        this.dataConserto = dataConserto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Manutencao() {
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

    public String getDataDefeito() {
        return dataDefeito;
    }

    public void setDataDefeito(String dataDefeito) {
        this.dataDefeito = dataDefeito;
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
