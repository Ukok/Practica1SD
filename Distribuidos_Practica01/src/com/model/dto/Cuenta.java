/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dto;

/**
 *
 * @author alejandro
 * @author mario
 */
public class Cuenta {

  private long id_cuenta;
  private double balance;
  private int id_cliente;

  public long getId_cuenta() {
    return id_cuenta;
  }

  public void setId_cuenta(long id_cuenta) {
    this.id_cuenta = id_cuenta;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(int id_cliente) {
    this.id_cliente = id_cliente;
  }
  
  
}
