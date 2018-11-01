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
public class TipoLogin {
    private int idTipoLogin;
    private String tipo;

    public TipoLogin(){}
    
    public int getIdTipoLogin() {
        return idTipoLogin;
    }

    public void setIdTipoLogin(int idTipoLogin) {
        this.idTipoLogin = idTipoLogin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
