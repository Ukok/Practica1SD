/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;

import com.client.controller.ClientController;

/**
 *
 * @author mario
 */
public class ClienteTest {

   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(() -> {
         com.client.model.Cliente c = null;
         ClientController cc = new ClientController(c);
         cc.show();
      });
   }
}
