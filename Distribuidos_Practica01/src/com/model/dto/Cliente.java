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
public class Cliente {

  private int id_cliente;
  private String password;
  private String nombre;
  private String apaterno;
  private String amaterno;
  private String telefono;
  private String calle;
  private String colonia;
  private int numero;

  public int getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(int id_cliente) {
    this.id_cliente = id_cliente;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApaterno() {
    return apaterno;
  }

  public void setApaterno(String apaterno) {
    this.apaterno = apaterno;
  }

  public String getAmaterno() {
    return amaterno;
  }

  public void setAmaterno(String amaterno) {
    this.amaterno = amaterno;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  
}
