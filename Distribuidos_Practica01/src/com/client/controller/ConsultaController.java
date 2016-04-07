package com.client.controller;

import com.client.model.Cliente;
import com.client.view.VentanaInterna;
import com.client.view.panel.PanelConsulta;

/**
 *
 * @author mario
 * @author alejandro
 */
public class ConsultaController extends Controller {
   
   ConsultaController(Cliente c, VentanaInterna vi) {
      super(c, vi);
      panel = new PanelConsulta();
   }
   
   public void consultar() {
      
   }
   
   @Override
   public void reset() {
      ((PanelConsulta) panel).lblSaldo.setText("");
   }
   
}
