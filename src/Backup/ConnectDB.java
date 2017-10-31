/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Buddhika Prasanna
 */
public class ConnectDB {

        private static Connection conn;
    private static ResultSet rs;
    private static String serverIP, port, database, username, password;
    //To Connect DB.........

    public static Connection getConn() {
        if (conn == null) {
            try {
                serverIP = ConnConfig.getSeverIP();
                port = ConnConfig.getSeverPort();
                database = ConnConfig.getDatabase();
                username = ConnConfig.getLogUser();
                password = ConnConfig.getLogPassword();
                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                conn = DriverManager.getConnection("jdbc:mysql://" + serverIP + ":" + port + "/" + database + "?useUnicode=true&characterEncoding=UTF-8", "" + username + "", "" + password + "");
                conn = DriverManager.getConnection("jdbc:mysql://" + serverIP + ":" + port + "/" + database + "?useUnicode=true&characterEncoding=UTF-8", "" + username + "", "" + password + "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        return conn;
    }

}
