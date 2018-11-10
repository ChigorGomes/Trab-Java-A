package br.com.controleequipamentos.classes;

public class Status {
    private int idStatus;
    private String tipoStatus;

    public Status(){}
    
    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getTipoStatus() {
        return tipoStatus;
    }

    public void setTipoStatus(String tipoStatus) {
        this.tipoStatus = tipoStatus;
    }
    
}
