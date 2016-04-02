/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.model.dao;

import com.model.dto.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class CuentaDAO {

  public static synchronized boolean create(Cuenta cuenta) {
    boolean flag = false;
    return flag;
  }

  public static synchronized Cuenta read(Cuenta cuenta) {
    return cuenta;
  }

  public static synchronized ArrayList<Cuenta> readAll() {
    ArrayList<Cuenta> list = new ArrayList<>();
    return list;
  }

  public static synchronized boolean update(Cuenta cuenta) {
    boolean flag = false;
    return flag;
  }

  public static synchronized boolean delete(Cuenta cuenta) {
    boolean flag = false;
    return flag;
  }
}
