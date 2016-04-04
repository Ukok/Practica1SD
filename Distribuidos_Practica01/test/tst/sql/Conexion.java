/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst.sql;

import com.server.model.sql.DBMSConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandro
 */
public class Conexion {
  public static void main(String[] args) {
    Connection connection = null;
    
    System.out.print("Get Connection");
    connection = DBMSConnection.getConnection();
    System.out.println("[OK]");
    
    
    try {
      System.out.print("Close Connection");
      DBMSConnection.close(connection);
      System.out.println("[OK]");
    } catch (SQLException ex) {
      Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
