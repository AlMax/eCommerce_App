/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author 76072398
 */
public class Driver {
    Connection connessione;
    Statement stmt;
    ResultSet dati;
    HashMap<String,String> responsabili;
    HashMap<String,ArrayList<String>> prodottiDisponibili;
    
    public Driver(String database,String user,String password) throws SQLException{
        connessione = DriverManager.getConnection(database,user,password);
        stmt = connessione.createStatement();
        
        this.queryResponsabili();
        this.queryProdotti();
    }
    
    private void queryProdotti() throws SQLException{
        prodottiDisponibili = new HashMap(); 
        this.dati = stmt.executeQuery("SELECT * FROM prodotti");
        while(this.dati.next()){
            ArrayList<String> attributi = new ArrayList();
            attributi.add(0,this.dati.getString("denominazione"));
            attributi.add(1,this.dati.getString("descrizione"));
            attributi.add(2,this.dati.getString("prezzo"));
            attributi.add(3,this.dati.getString("quantita"));
            prodottiDisponibili.put(this.dati.getString("codice_prodotto"),attributi);
        }
    }
    
    private void queryResponsabili() throws SQLException{
        responsabili = new HashMap(); 
        this.dati = stmt.executeQuery("select * from responsabili");
        while(this.dati.next()){
            responsabili.put(this.dati.getString("dipartimento"),this.dati.getString("password"));
        }
    }
    
    public boolean isRegistered(String Luser,String Lpass) throws SQLException{     
        return responsabili.containsKey(Luser) && Lpass.equals(responsabili.get(Luser));
    }
}
