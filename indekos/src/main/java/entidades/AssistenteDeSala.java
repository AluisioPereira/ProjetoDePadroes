/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author José
 */
public class AssistenteDeSala {
     private Usuario Usuario;

    public AssistenteDeSala(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
     
}
