/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;

/**
 *
 * @author 76072398
 */
public class JDBC {
    Driver connection;
    LoginFrame login;
    
    public JDBC() throws SQLException{
        connection = new Driver("jdbc:mysql://localhost:3306/e_commerce","AlMax","");
        login = new LoginFrame();
    }
    
    public void access_responsabili() throws SQLException{
        login.bttn_log.addActionListener((ActionEvent event) -> {
            try {
                if (Desktop.isDesktopSupported())
                    if(connection.isRegistered(login.getTxt_user().getText(),String.valueOf(login.getTxt_pass().getPassword())))
                        Desktop.getDesktop().browse(new URI("http://localhost:8080/e_commerce/"+login.getTxt_user().getText()+".php"));
                else
                        Desktop.getDesktop().browse(new URI("http://localhost:8080/e_commerce"));
            } catch (SQLException | URISyntaxException | IOException ex) {
                System.err.println("Errore nel JDBC: "+ex);
            }
        });
    }

    public jdbc.Driver getConnection() {
        return connection;
    }

    public void setConnection(jdbc.Driver connection) {
        this.connection = connection;
    }

    public LoginFrame getLogin() {
        return login;
    }

    public void setLogin(LoginFrame login) {
        this.login = login;
    }   
}
