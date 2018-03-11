/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.text.StyleConstants;

/**
 *
 * @author 76072398
 */
public class LoginFrame {
    JFrame frame; 
    JPanel panel;
    JLabel lbl_user;
    JLabel lbl_pass;
    JTextField txt_user;
    JPasswordField txt_pass;
    JButton bttn_log;
    
    public LoginFrame(){
        frame = new JFrame("Login Responsabili"); 
        panel = new JPanel();        
        lbl_user = new JLabel("Dipartimento");
        lbl_pass = new JLabel("Password");
        txt_user = new JTextField();
        txt_pass = new JPasswordField();
        bttn_log = new JButton("Login");
        
        lbl_user.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        lbl_user.setHorizontalAlignment(JLabel.CENTER);
        lbl_user.setVerticalAlignment(JLabel.CENTER);
        lbl_pass.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        lbl_pass.setHorizontalAlignment(JLabel.CENTER);
        lbl_pass.setVerticalAlignment(JLabel.CENTER);
        
        txt_user.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        txt_user.setAlignmentX(StyleConstants.ALIGN_CENTER);
        txt_user.setAlignmentY(StyleConstants.ALIGN_CENTER);
        txt_pass.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        txt_pass.setAlignmentX(StyleConstants.ALIGN_CENTER);
        txt_pass.setAlignmentY(StyleConstants.ALIGN_CENTER);
        
        lbl_user.setBounds(15, 10, 100, 40);
        lbl_pass.setBounds(15, 60, 100, 40);
        txt_user.setBounds(122, 10, 150, 40);
        txt_pass.setBounds(122, 60, 150, 40);
        bttn_log.setBounds(102, 112, 100, 40);
        
        panel.add(lbl_user);
        panel.add(lbl_pass);
        panel.add(txt_user);
        panel.add(txt_pass);
        panel.add(bttn_log);
        panel.setLayout(new BorderLayout());
        
        frame.setSize(304, 200);
        frame.add(panel);
        frame.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLbl_user() {
        return lbl_user;
    }

    public void setLbl_user(JLabel lbl_user) {
        this.lbl_user = lbl_user;
    }

    public JLabel getLbl_pass() {
        return lbl_pass;
    }

    public void setLbl_pass(JLabel lbl_pass) {
        this.lbl_pass = lbl_pass;
    }

    public JTextField getTxt_user() {
        return txt_user;
    }

    public void setTxt_user(JTextField txt_user) {
        this.txt_user = txt_user;
    }

    public JPasswordField getTxt_pass() {
        return txt_pass;
    }

    public void setTxt_pass(JPasswordField txt_pass) {
        this.txt_pass = txt_pass;
    }

    public JButton getBttn_log() {
        return bttn_log;
    }

    public void setBttn_log(JButton bttn_log) {
        this.bttn_log = bttn_log;
    }

}
