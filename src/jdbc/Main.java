/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.SQLException;

/**
 *
 * @author 76072398
 */
public class Main {
    public static void main(String[] args) {
        try {
            JDBC commerce = new JDBC();
            Driver connessione = commerce.getConnection();
            LoginFrame log = commerce.getLogin();
            commerce.access_responsabili();
        } catch (SQLException e) {
            System.err.println("Errore:"+e);
        }       
    } 
}
