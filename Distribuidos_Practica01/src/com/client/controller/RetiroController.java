package com.client.controller;

import com.client.model.Cliente;
import com.client.view.VentanaInterna;
import com.client.view.panel.PanelRetiro;
import java.awt.event.ActionEvent;

/**
 *
 * @author mario
 */
public class RetiroController extends Controller {

   RetiroController(Cliente c, VentanaInterna vi) {
      super(c, vi);
      panel = new PanelRetiro();
      ((PanelRetiro) panel).btnAceptar.addActionListener(this::btnAceptarActionPerformed);
      ((PanelRetiro) panel).btnCancelar.addActionListener(this::btnCancelarActionPerformed);
      ((PanelRetiro) panel).btn50.addActionListener(this::btn50ActionPerformed);
      ((PanelRetiro) panel).btn100.addActionListener(this::btn100ActionPerformed);
      ((PanelRetiro) panel).btn200.addActionListener(this::btn200ActionPerformed);
      ((PanelRetiro) panel).btn500.addActionListener(this::btn500ActionPerformed);
      ((PanelRetiro) panel).btn1000.addActionListener(this::btn1000ActionPerformed);
      ((PanelRetiro) panel).btn1500.addActionListener(this::btn1500ActionPerformed);
      ((PanelRetiro) panel).btn2000.addActionListener(this::btn2000ActionPerformed);
      ((PanelRetiro) panel).btn3000.addActionListener(this::btn3000ActionPerformed);

   }

   public void btnAceptarActionPerformed(ActionEvent e) {
      try {
         String aux = ((PanelRetiro) panel).txtMonto.getText();
         int monto = Integer.parseInt(aux);
         if ((monto % 50) == 0) {
            retirar(monto);
         } else {
            System.err.println("El monto debe ser multiplo de 50");
         }
      } catch (NumberFormatException ex) {
         System.err.println("Error el monto debe se numérico");
      }
   }

   public void btn50ActionPerformed(ActionEvent e) {
      retirar(50);
   }

   public void btn100ActionPerformed(ActionEvent e) {
      retirar(100);
   }

   public void btn200ActionPerformed(ActionEvent e) {
      retirar(200);
   }

   public void btn500ActionPerformed(ActionEvent e) {
      retirar(500);
   }

   public void btn1000ActionPerformed(ActionEvent e) {
      retirar(1000);
   }

   public void btn1500ActionPerformed(ActionEvent e) {
      retirar(1500);
   }

   public void btn2000ActionPerformed(ActionEvent e) {
      retirar(2000);
   }

   public void btn3000ActionPerformed(ActionEvent e) {
      retirar(3000);
   }

   public void retirar(int monto) {

      this.reset();
   }

   @Override
   public void reset() {
      ((PanelRetiro) panel).txtMonto.setText("");
   }

}
