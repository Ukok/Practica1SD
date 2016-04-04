/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.model.dao;

import com.model.dto.Cliente;
import java.util.ArrayList;

/**
 *
 * @author alejandro
 * @author mario
 */
public class ClienteDAO {

  public static synchronized boolean create( Cliente cliente) {
    boolean flag = false;
    return flag;
  }

  public static synchronized Cliente read(Cliente cliente) {
    return cliente;
  }

  public static synchronized ArrayList<Cliente> readAll() {
    ArrayList<Cliente> list = new ArrayList<>();
    return list;
  }

  public static synchronized boolean update(Cliente cliente) {
    boolean flag = false;
    return flag;
  }

  public static synchronized boolean delete(Cliente cliente) {
    boolean flag = false;
    return flag;
  }
}
