/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb.indekos.interfaces;

/**
 *
 * @author José
 */
import com.gmail.joseifpb.indekos.daos.UsuarioDao;
public interface InterfaceDAOFactory {
  
    /**
     *
     * @return
     */
    public  UsuarioDao criaUsuarioDAO();
}
