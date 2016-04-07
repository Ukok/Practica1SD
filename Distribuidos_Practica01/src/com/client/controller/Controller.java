package com.client.controller;

import com.client.model.Cliente;
import com.client.view.VentanaInterna;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public abstract class Controller {

   Cliente cliente;
   VentanaInterna vi;
   JPanel panel;

   public Controller(Cliente c, VentanaInterna vi) {
      this.cliente = c;
      this.vi = vi;
   }

   private void loadPanel() {
      vi.getContentPane().removeAll();
      vi.add(panel, java.awt.BorderLayout.CENTER);
      panel.setVisible(true);
      panel.updateUI();
      vi.show();
      vi.updateUI();
      vi.pack();
      
   }

   public void showPanel(String title) {
      vi.setTitle(title);
      this.loadPanel();
   }

   public void btnCancelarActionPerformed(ActionEvent e) {
      this.vi.setVisible(false);
      this.reset();
   }

   public abstract void reset();
}
