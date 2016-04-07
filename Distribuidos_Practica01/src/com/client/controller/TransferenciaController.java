package com.client.controller;

import com.client.model.Cliente;
import com.client.view.VentanaInterna;
import com.client.view.panel.PanelTransferencia;
import java.awt.event.ActionEvent;

/**
 *
 * @author mario
 */
public class TransferenciaController extends Controller {

   TransferenciaController(Cliente c, VentanaInterna vi) {
      super(c, vi);
      panel = new PanelTransferencia();
      ((PanelTransferencia) panel).btnAceptar.addActionListener(this::btnAceptarActionPerformed);
      ((PanelTransferencia) panel).btnCancelar.addActionListener(this::btnCancelarActionPerformed);
   }

   public void btnAceptarActionPerformed(ActionEvent e) {
      transferir();
   }

   public void transferir() {
      String aux1 = ((PanelTransferencia) panel).txtCuentaOrigen.getText();
      String aux2 = ((PanelTransferencia) panel).txtCuentaDestino.getText();
      String aux3 = ((PanelTransferencia) panel).txtMonto.getText();
      try {
         if (!aux1.equals("") && !aux2.equals("") && !aux3.equals("")) {
            Float a = Float.parseFloat(aux3);

         } else {
            System.err.println("Error los datos son obligatorios");
         }
      } catch (NumberFormatException ex) {
         System.err.println("Error los datos deben ser numéricos");
      }
   }

   @Override
   public void reset() {
      ((PanelTransferencia) panel).txtCuentaOrigen.setText("");
      ((PanelTransferencia) panel).txtCuentaDestino.setText("");
      ((PanelTransferencia) panel).txtMonto.setText("");
   }

}
