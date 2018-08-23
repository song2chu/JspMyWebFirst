/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author safev
 */
public class Database {
    public Connection con;
    
    //Connect DD
    public Database(){
        try {
            Class.forName(DatabaseInfo.DRIVER);
            con = DriverManager.getConnection(DatabaseInfo.URI, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
            
            System.out.println("DATABASE ALREADY CONNECTED !");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public void close(){
        try {
            if (con!=null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
}
