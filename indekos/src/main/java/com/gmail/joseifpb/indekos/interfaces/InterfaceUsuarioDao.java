/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb.indekos.interfaces;

import com.gmail.joseifpb.indekos.entidades.Usuario;
import java.util.List;

/**
 *
 * @author José
 */
public interface InterfaceUsuarioDao {
    public boolean adicionar(Usuario usuario);//throws PersistenciaException;

	public boolean remover(String matricula);

	public boolean editar(Usuario usuario);

	public Usuario login(String email, String senha);
        
         public List<Usuario> buscaTotosUsuarios();
         
         public List<Usuario> buscaPorPalavraCavhe();

    
}
