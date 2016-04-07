package com.client.controller;

import com.client.model.Cliente;
import com.client.view.Principal;
import com.client.view.VentanaInterna;
import java.awt.event.ActionEvent;

/**
 *
 * @author mario
 */
public class ClientController {

   Principal ventana;
   VentanaInterna vi;

   ConsultaController consulta;
   DepositoController deposito;
   RetiroController retiro;
   TransferenciaController transferencia;

   public ClientController(Cliente c) {
      vi = new VentanaInterna();
      vi.setVisible(false);
      ventana = new Principal();
      ventana.dpPrincipal.add(vi);
      ventana.btnConsulta.addActionListener(this::btnConsultaActionPerformed);
      ventana.btnDeposito.addActionListener(this::btnDepositoActionPerformed);
      ventana.btnTransferencia.addActionListener(this::btnTransferenciaActionPerformed);
      ventana.btnRetiro.addActionListener(this::btnRetiroActionPerformed);
      ventana.btnCerrar.addActionListener(this::btnCerrarActionPerformed);
      consulta = new ConsultaController(c, vi);
      deposito = new DepositoController(c, vi);
      retiro = new RetiroController(c, vi);
      transferencia = new TransferenciaController(c, vi);
   }

   public void btnConsultaActionPerformed(ActionEvent e) {
      consulta.showPanel("Consulta");
      centrarVentanaInterna();
   }

   public void btnDepositoActionPerformed(ActionEvent e) {
      deposito.showPanel("Deposito");
      centrarVentanaInterna();
   }

   public void btnTransferenciaActionPerformed(ActionEvent e) {
      transferencia.showPanel("Transferencia");
      centrarVentanaInterna();
   }

   public void btnRetiroActionPerformed(ActionEvent e) {
      retiro.showPanel("Retiro de efectivo");
      centrarVentanaInterna();
   }

   public void btnCerrarActionPerformed(ActionEvent e) {
      System.exit(0);
   }

   public void show() {
      this.ventana.setVisible(true);
      this.ventana.setLocationRelativeTo(null);
   }

   private void centrarVentanaInterna() {
      int x = (ventana.getSize().width / 2) - (vi.getWidth() / 2);
      int y = (ventana.getSize().height / 2) - (vi.getHeight());
      vi.setLocation(x, y);
   }

}
