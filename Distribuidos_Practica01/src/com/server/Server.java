package com.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario
 */
public class Server extends Thread {

   public static final int PORT = 6666;

   public Server() {
   }

   @Override
   public void run() {
      try {
         ServerSocket ss = new ServerSocket(PORT);
         while (true) {
            System.out.println("\n[[Server] Esperando petición...");
            Socket sc = ss.accept();
            //Aqui el hilo que atiende al cliente
         }
      } catch (IOException ex) {
         Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   public static void main(String[] args) {
      Server s = new Server();
      s.start();
   }
}
