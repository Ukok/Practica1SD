/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.model.sql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejandro
 */
public class DBMSConnection {

  public static final String DRIVER = "com.mysql.jdbc.Driver";
  public static final String USER = "practica1";
  public static final String PASS = "practica1";
  public static final String URLDB = "jdbc:mysql://127.0.0.1/practica1";

  public static synchronized Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName(DRIVER);
      connection = DriverManager.getConnection(URLDB, USER, PASS);

    } catch (ClassNotFoundException | SQLException ex) {
      System.out.println(" " + ex.getLocalizedMessage());
      connection = null;
    }
    return connection;
  }

  public static synchronized void rollback(Connection connection)
          throws SQLException {
    connection.rollback();
  }

  public static synchronized void close(Connection connection)
          throws SQLException {
    connection.close();
  }

  public static synchronized void close(CallableStatement statement)
          throws SQLException {
    statement.close();
  }
}
