/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summercoding.bank.entities;

import com.summercoding.bank.utils.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TCHAWA Dickens
 */
public class Compte {

    private static Compte account;

    int idcompte;

    double solde;

    int idadmin;

    int iduser;

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void save(double solde, int idadmin, int iduser) {
        try {
            String command = "INSERT INTO `compte`(`solde`, `idadmin`, `iduser`) VALUES (?,?,?)";

            PreparedStatement addstmt
                    = JDBC.getConnexion().prepareStatement(command);

            addstmt.setObject(1, solde);
            addstmt.setObject(2, idadmin);
            addstmt.setObject(3, iduser);
            addstmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(double solde, int idadmin, int iduser) throws SQLException {
        String command = "UPDATE `compte` SET `solde` = ?, `idadmin` = ?, `iduser` = ? WHERE `compte`.`idcompte` = ?;";

        PreparedStatement addstmt
                = JDBC.getConnexion().prepareStatement(command);

        addstmt.setObject(1, idcompte);
        addstmt.setObject(2, solde);
        addstmt.setObject(3, idadmin);
        addstmt.setObject(4, iduser);
        addstmt.execute();
    }

    public void delete(int idadmin) throws SQLException {
        String command = "DELETE FROM `compte` WHERE `compte`.`idcompte` = ?;";

        PreparedStatement addstmt
                = JDBC.getConnexion().prepareStatement(command);

        addstmt.setObject(1, idcompte);
        addstmt.execute();
    }

    public Compte getOne(int idcompte) throws SQLException {

        String cmd = "select * from compte where idcompte = ?";

        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);

        stmt.setObject(1, idcompte);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            return new Compte(rs.getInt(1), (float) rs.getDouble(2), rs.getInt(3), rs.getInt(4));
        }

        return null;
    }

    public Compte getBySolde(double solde) throws SQLException {

        String cmd = "select * from compte where solde = ?";

        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);

        stmt.setObject(1, solde);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            return new Compte(rs.getInt(1), (float) rs.getDouble(2), rs.getInt(3), rs.getInt(4));
        }

        return null;
    }

    public List<Compte> getAllCompte() throws SQLException {

        String cmd = "select * from compte";

        PreparedStatement stmt
                = JDBC.getConnexion().prepareStatement(cmd);

        ResultSet rs = stmt.executeQuery();

        List<Compte> listCompte = new ArrayList<>();
        while (rs.next()) {
            listCompte.add(new Compte(rs.getInt(1), (float) rs.getDouble(2), rs.getInt(3), rs.getInt(4)));
        }

        return listCompte;
    }

    public Compte(int idcompte, double solde, int idadmin, int iduser) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.idadmin = idadmin;
        this.iduser = iduser;
    }

    public Compte() {
    }

    @Override
    public String toString() {
        return "Compte{" + "idcompte=" + idcompte + ", solde=" + solde + ", idadmin=" + idadmin + ", iduser=" + iduser + '}';
    }

    public static void main(String arg[]) throws SQLException {
        Compte acc = new Compte();
        String result;
            //result = acc.getOne(1).toString();
        //System.out.println(result);

            //result = acc.getByLoginAndPassword("root", "root2").toString();
        //System.out.println(result);
        result = acc.getAllCompte().toString();
        System.out.println(result);

            //acc.update(5, "paul", "paul", "paul");
        //acc.delete(7);
    }

}
