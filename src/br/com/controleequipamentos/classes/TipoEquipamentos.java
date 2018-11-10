package br.com.controleequipamentos.classes;

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
    
   @Override
    public String toString() {
        return this.nomeEquipamento;
    }
    
}
