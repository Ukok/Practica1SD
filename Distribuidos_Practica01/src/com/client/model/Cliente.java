package com.client.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cliente se encarga de enviar y recibir parametros mediante un Socket.
 *
 * @author mario
 * @version 1.0
 */
public class Cliente {

   private final Socket socket;

   private final ObjectOutputStream oos;
   private final ObjectInputStream ois;

   public Cliente(Socket socket) throws IOException {
      this.socket = socket;
      this.oos = new ObjectOutputStream(socket.getOutputStream());
      this.ois = new ObjectInputStream(socket.getInputStream());
   }

   public Cliente(String host, int port) throws IOException {
      this.socket = new Socket(host, port);
      this.oos = new ObjectOutputStream(socket.getOutputStream());
      this.ois = new ObjectInputStream(socket.getInputStream());
   }

   public void cerrar() throws IOException {
      oos.close();
      ois.close();
      socket.close();
   }

   public void escribir(int i) throws IOException {
      oos.writeInt(i);
      oos.flush();
   }

   public void escribir(Object obj) throws IOException {
      oos.writeObject(obj);
      oos.flush();
   }

   public boolean leerBool() throws IOException {
      return ois.readBoolean();
   }

   public Object leerObjecto() throws IOException {
      try {
         return ois.readObject();
      } catch (ClassNotFoundException ex) {
         Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
         return null;
      }
   }

}
