package br.com.controleequipamentos.classes;

public class Descricao {
    private int idTombamento;
    private int idEquipamento;
    private String descricao;
    private String DataDesc;
    private String localDesc;

    public Descricao(){}
    
    public int getIdTombamento() {
        return idTombamento;
    }

    public void setIdTombamento(int idTombamento) {
        this.idTombamento = idTombamento;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDesc() {
        return DataDesc;
    }

    public void setDataDesc(String DataDesc) {
        this.DataDesc = DataDesc;
    }

    public String getLocalDesc() {
        return localDesc;
    }

    public void setLocalDesc(String localDesc) {
        this.localDesc = localDesc;
    }
    
    
}
