/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uta.interfaces;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Corsair
 */
public class conexion {
    Connection connect = null;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = (Connection) DriverManager.getConnection
            ("jdbc:mysql://localhost/uta","root","");
        }
         catch (Exception ex){
             JOptionPane.showMessageDialog(null,ex);
         }
            return connect;     
    }
}
