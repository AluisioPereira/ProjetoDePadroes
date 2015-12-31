/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb.indekos.entidades;

/**
 *
 * @author José
 */
public class AlunoMonitor {
     private Usuario Usuario;

    public AlunoMonitor(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
     
}
