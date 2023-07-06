/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercoding.bank.controlleur;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Compte;
import com.summercoding.bank.entities.Utilisateur;
import com.summercoding.bank.gestionnaires.GestionnaireAdmin;
import com.summercoding.bank.gestionnaires.GestionnaireCompte;
import com.summercoding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author TCHAWA Dickens
 */
public class Controlleur {
    
    GestionnaireAdmin gestionnaireAdmin = new GestionnaireAdmin();
    
    GestionnaireUtilisateur gestionnaireUtilisateur = new GestionnaireUtilisateur();
    
    GestionnaireCompte gestionnaireCompte = new GestionnaireCompte();
    
    public Admin routeVersLogin(String login, String pwd) throws SQLException{
        
        return gestionnaireAdmin.login(login, pwd);
    
    }
    
    public void routeVersSaveAdmin(String login, String password, String nom) throws SQLException{
        
        gestionnaireAdmin.saveAdmin(login, password, nom);
    
    }
    
    public List<Admin> routeVersListAllAdmin() throws SQLException{
        
        return gestionnaireAdmin.listAllAdmin();
    
    }
    
    public void routeVersSaveUtilisateur(String login, String password, String nom,
             String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
    
        gestionnaireUtilisateur.saveUtilisateur(login, password, nom, prenom, datenaiss, genre, idadmin);
        
    }
    
    public List<Utilisateur> routeVersListeUtilisateur() throws SQLException{
        
        return gestionnaireUtilisateur.listAllUtilisateur();
    
    }
    
    public void routeVersSaveCompte(double solde, int idadmin, int iduser){
        
        gestionnaireCompte.saveCompte(solde, idadmin, iduser);
        
    }
    
    public List<Compte> routeVersListeCompte() throws SQLException{
    
        return gestionnaireCompte.listAllCompte();
    }
}
