/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Compte;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author TCHAWA Dickens
 */
public class GestionnaireCompte {
    
    private Compte compte = new Compte();
    
    
    public void saveCompte(double solde, int idadmin, int iduser){
    
        compte.save(solde, idadmin, iduser);
    }
    
     public List<Compte> listAllCompte() throws SQLException{
     
        return compte.getAllCompte();
     
     }
    
}
