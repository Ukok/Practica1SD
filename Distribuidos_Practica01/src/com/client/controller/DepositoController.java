package com.client.controller;

import com.client.model.Cliente;
import com.client.view.VentanaInterna;
import com.client.view.panel.PanelDeposito;
import java.awt.event.ActionEvent;

/**
 *
 * @author mario
 */
public class DepositoController extends Controller {
   
   public DepositoController(Cliente c, VentanaInterna vi) {
      super(c, vi);
      panel = new PanelDeposito();
      ((PanelDeposito) panel).btnAceptar.addActionListener(this::btnAceptarActionPerformed);
      ((PanelDeposito) panel).btnCancelar.addActionListener(this::btnCancelarActionPerformed);
   }
   
   public void btnAceptarActionPerformed(ActionEvent e) {
      depositar();
   }
   
   public void depositar() {
      String aux = ((PanelDeposito) panel).txtCuenta.getText();
      String aux2 = ((PanelDeposito) panel).txtMonto.getText();
      try {
         if (!aux.equals("") && !aux2.equals("")) {
            Float a = Float.parseFloat(aux2);
            
         } else {
            System.err.println("Error los campos son obligatorios");
         }
      } catch (NumberFormatException a) {
         System.err.println("Error en el monto, debe ser numerico");
         
      }
   }
   
   @Override
   public void reset() {
      ((PanelDeposito) panel).txtCuenta.setText("");
      ((PanelDeposito) panel).txtMonto.setText("");
   }
   
}
