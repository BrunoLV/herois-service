/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.heroi.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brunolv
 */
public final class ConnectionFactory {
    
    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/herois_db", "root", "root");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return c;
    }
    
}
