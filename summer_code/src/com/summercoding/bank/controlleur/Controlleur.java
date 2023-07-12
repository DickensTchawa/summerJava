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

    public Admin routeVersLogin(String login, String pwd) throws SQLException {

        return gestionnaireAdmin.login(login, pwd);

    }

    public Utilisateur routeVersLoginUser(String login, String pwd) throws SQLException {

        return gestionnaireUtilisateur.login(login, pwd);

    }

    public void routeVersSaveAdmin(String login, String password, String nom) throws SQLException {

        gestionnaireAdmin.saveAdmin(login, password, nom);

    }
    public void routeVersUpdateAdmin(int idadmin, String login, String password, String nom) throws SQLException {

        gestionnaireAdmin.updateAdmin(idadmin, login, password, nom);

    }
    
    public Admin routeVersDeleteAdmin(int idadmin) throws SQLException{
    
        gestionnaireAdmin.deleteAdmin(idadmin);
        return null;
        
    }
    

    public List<Admin> routeVersListAllAdmin() throws SQLException {

        return gestionnaireAdmin.listAllAdmin();

    }
    
    public Admin routeVersAdminDetails(int idadmin) throws SQLException{
    
        return gestionnaireAdmin.getAdminDetails(idadmin);
    }

    public void routeVersSaveUtilisateur(String login, String password, String nom,
            String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException {

        gestionnaireUtilisateur.saveUtilisateur(login, password, nom, prenom, datenaiss, genre, idadmin);

    }
    
     public void routeVersUpdateUtilisateur(String login, String password, String nom,
            String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException {

        gestionnaireUtilisateur.updateUtilisateur(login, password, nom, nom, LocalDate.MIN, nom, idadmin);

    }
    
    public Admin routeVersDeleteUtilisateur(int iduser) throws SQLException{
    
        gestionnaireUtilisateur.deleteUtilisateur(iduser);
        return null;
        
    }

    public List<Utilisateur> routeVersListeUtilisateur() throws SQLException {

        return gestionnaireUtilisateur.listAllUtilisateur();

    }
    
    public Utilisateur routeVersUtilisateurDetails(int iduser) throws SQLException {
    
        return gestionnaireUtilisateur.getUtilisateurDetails(iduser);
    }

    public void routeVersSaveCompte(double solde, int idadmin, int iduser) {

        gestionnaireCompte.saveCompte(solde, idadmin, iduser);

    }
    
    
    public void routeVersUpdateCompte(double solde, int idadmin, int iduser) throws SQLException {

        gestionnaireCompte.updateCompte(solde, idadmin, iduser);

    }
    
    public Admin routeVersDeleteCompte(int idcompte) throws SQLException{
    
        gestionnaireCompte.deleteCompte(idcompte);
        return null;
        
    }

    public List<Compte> routeVersListeCompte() throws SQLException {

        return gestionnaireCompte.listAllCompte();
    }
    
    public Compte routeVersCompteDetails(int idcompte) throws SQLException {
    
        return gestionnaireCompte.getCompteDetails(idcompte);
    }
}
