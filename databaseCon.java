/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.sql.*;
public class databaseCon {
  String woord = "";
   public databaseCon(String m){
       String vraag = m.substring(0,5);
       String subString = m.substring(5, 13);
       String subsubString = "";
       if(m.length() > 13){
           subsubString = m.substring(13);
       }

       try{
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useSSL=false", "newuser", "password");
         if(vraag.equals("SALDO")){
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("Select saldo from rekeninghouder where cardID ='" + subString + "'");
        while(res.next()){
            woord = res.getString("saldo");
            System.out.println(woord);
        }
        con.close();
        }else if(vraag.equals("PINCO")){
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("Select pin from rekeninghouder where cardID = '" + subString + "'");
                while(res.next()){
                    woord = res.getString("pin");
                    System.out.println(woord);
                }
                con.close();
         }else if(vraag.equals("BLOCK")){
             Statement st = con.createStatement();
             st.executeUpdate("update rekeninghouder set state_block = 1 where cardID = '"+subString+"'");

             con.close();
         }else if(vraag.equals("GETAP")){
             Statement st = con.createStatement();
             st.executeUpdate("Select aantal_pog from rekeninghouder where cardID = '" + subString + "'");

             con.close();
         }
         else if(vraag.equals("WITHD")){
             Statement s = con.createStatement();
             int new_saldo = Integer.parseInt(subsubString);
             s.executeUpdate("UPDATE rekeninghouder set saldo = saldo - "+new_saldo+" Where cardID = '" + subString+"'");
             woord = Integer.toString(new_saldo);
             con.close();
         }else if(vraag.equals("GETBL")){
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("Select state_block from rekeninghouder where cardID = '" + subString + "'" );
                     while(res.next()){
                 woord = res.getString("state_block");
             }
             con.close();
         }
     }catch(Exception e){
         e.printStackTrace();
     }
    }
    public String getResult(){
        return woord;
    }
}
