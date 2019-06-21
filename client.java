/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author joryv
 */
public class client {
    String response = "";
    boolean done = false;
    DataOutputStream out;
    OutputStream outToServer;
    String pin="";
    InputStream inFromServer;
    DataInputStream in;
public String begin(String s){
    String serverName = "145.24.222.201";
      int port = Integer.parseInt("8080");
      try {
         Socket client = new Socket(serverName, port);
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
          outToServer = client.getOutputStream();
          out = new DataOutputStream(outToServer);
         //We hebben een parameter die als volgt eruitziet: "CHAR + ID" de char geeft aan welke info er opevraagd wordt.
         //A = Saldo, B = Pincode
         out.writeUTF(s);
         inFromServer = client.getInputStream();

         in = new DataInputStream(inFromServer);
         //get balance, pincode, ID nummer;
          response = in.readUTF();
         System.out.println("Response is " + response);
         done = true;
      } catch (IOException e) {
         e.printStackTrace();
      }catch(Exception e){
          e.printStackTrace();
      }
      return response;
}

}