/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;

public class ServerHandler extends Thread {
   private ServerSocket serverSocket;

  public static void main(String[] args){
          int port = 8080;
          try{
                  Thread t = new ServerHandler(port);
                  t.start();
          }catch(Exception e){
                  e.printStackTrace();
          }

  }
    public ServerHandler(int port) throws IOException{
        serverSocket = new ServerSocket(port);

    }
   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " +
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(server.getInputStream());
            String input = in.readUTF();
            databaseCon j = new databaseCon(input);
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF(j.getResult());
                server.close();

         } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         } catch (IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
}
