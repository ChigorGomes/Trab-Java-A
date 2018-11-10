package br.com.controleequipamentos.classes;

public class Usuario {

    private int idConta;
    private String nome;
    private String usuario;
    private String senha;
    private String tipoUsuario;

    public Usuario() {
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idComta) {
        this.idConta = idComta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
