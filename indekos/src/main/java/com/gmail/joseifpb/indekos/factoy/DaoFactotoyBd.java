/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb.indekos.factoy;

import com.gmail.joseifpb.indekos.daos.UsuarioDao;
import com.gmail.joseifpb.indekos.interfaces.InterfaceDAOFactory;
import com.gmail.joseifpb.indekos.daos.UsuarioDao;

/**
 *
 * @author José
 */
public class DaoFactotoyBd implements InterfaceDAOFactory {

    @Override
    public  UsuarioDao criaUsuarioDAO(){
        return new UsuarioDao();
        
            
        
    }
    
   
    
}
