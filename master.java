package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.EventQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class master {
    client server;
    Serial arduino = new Serial(); //Call Serial constructor
    GUI window;
    String pin = "1234";
    String s = "";
    client_new client = new client_new();
    int AantalCorrect = 0;
    int Saldo = 0;
    int Geld = 0;
    int bedrag = 0;
    String block = "";
    int poging = 0;
    String screens = "begin";
    
	//Scanner s = new Scanner(System.in);
	//int n = s.nextInt();
	
	public static void main(String[] args) {	
			while(true) {
				new master();
			}
				
	}
	
	
	public master() {
		// TODO Auto-generated constructor stub
		String input = "";
		Thread t = new Thread(arduino, "arduino");
		t.start();
		window = new GUI();
		window.frame.setVisible(true);
		screens = "start";
		while(true) {
			switch(screens) {
			case "start" : 
                                window.cardLayout.show(window.pnl_body, "beginScherm");
                                s = checkCard(); 
                                server = new client();
                                pin = server.begin("PINCO" + s);
                                Saldo = Integer.parseInt(server.begin("SALDO" + s));
                                block = server.begin("GETBL" + s);
                                
                                System.out.println(block);
                                
                                if(block.equals("1")){
                                    screens = "blokkeer";
                                    System.out.println(block);

                                }
                                else if(block.equals("0")){
                                    screens = "pin";
                                    System.out.println("geblokeerd");
                                }
				break;
			case "pin" :
				String ipin = "";
				window.cardLayout.show(window.pnl_body, "pincodeScherm");
				do {
                                    //poging=Integer.parseInt(server.begin("GETAP" + s));
                                    
					if(AantalCorrect>=3) {
						window.cardLayout.show(window.pnl_body, "blokScherm");
						System.out.println("failed to login");
						
                                                try {
							Thread.sleep(5000);
							window.frame.dispose();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return;
				
					}AantalCorrect++;
					ipin = readPin();
                                        
				}while(!pin.equals(ipin));
				AantalCorrect = 0;
				screens = "menu";
				break;
			case "menu" : 
				
				window.cardLayout.show(window.pnl_body, "menuScherm");
				input = input(); //wait for an input
						if(input.equals("D")) { // saldoScherm	
							System.out.println("Gaat het naar de saldoScherm");
							screens = "saldo";
						}	else if(input.equals("B")) { // opneemScherm
							System.out.println("Gaat het naar de opneemScherm");
							screens = "opneem";
						}	else if(input.equals("C")) { // beginScherm
							System.out.println("Gaat het naar de beginScherm");
							screens = "begin";
						}	else if(input.equals("A")) { // snelOpnemen ------> bonScherm
							System.out.println("Gaat het naar de bonScherm");
							if (opnemen(70)) {
								screens = "bon";
							} else {
								screens = "menu";
							}
						}
				
				break;
			case "saldo": // Bekijkt de saldo
				
				GUI.Saldo.setText("saldo is : " + Saldo);
				window.cardLayout.show(window.pnl_body, "saldoScherm");
				input = input();
				if(input.equals("A")) { 
					System.out.println("Naar het beginScherm");
					screens = "begin";  
				} else if(input.equals("B")) { 
					System.out.println("Naar het menuScherm");
					screens = "menu"; 
				}
				
				break;
			case "opneem": // case om geld op te vragen en vervolgens op te nemen
				// bedrag versturen naar mijn arduino 
				GUI.lblBedrag.setText(Integer.toString(bedrag));
				window.cardLayout.show(window.pnl_body, "opneemScherm");
				input = input();
				if (input.equals("1")){
					bedrag += 10;
					
				} else if (input.equals("2")) {
					bedrag += 20;
					
				} else if (input.equals("3")) {
					bedrag += 50;
					
				} else if(input.equals("B")) {
					System.out.println("Ga terug naar het menuScherm");
					screens = "menu";
					bedrag = 0;
				} else if(input.equals("C")) {
					System.out.println("Verwijder alles");
					bedrag = 0;
				} else if (input.equals("A")) {
					if (opnemen(bedrag)) {
                                                 System.out.println(bedrag);
                                                 screens = "bon";
						bedrag = 0;
					}
					else {
						bedrag = 0;
						screens = "menu";
                                    	}
				}
                                server.begin("WITHD" + s + Integer.toString(bedrag));
                                System.out.println(bedrag);
				break;
			case "eind": //  klaar
				window.cardLayout.show(window.pnl_body, "eindScherm");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				screens = "begin";
				break;
			case "bon": // klaar // functie bon gaan maken om dat te versturen naar mijn arduino
				window.cardLayout.show(window.pnl_body, "bonScherm");
				
				input = input();
				
				if(input.equals("B")) { // Je krijgt altijd een bon (geen bon)
					System.out.println("Fijne dag verder");
					screens = "eind";
				}if(input.equals("A")) { // Je krijgt altijd een bon (wel bon)
					System.out.println("Fijne dag verder");
					screens = "eind";
				}if(input.equals("D")) { // donneerScherm
					System.out.println("Wilt u een euro doneren");
					System.out.println("ga naar het doneerScherm");
					screens ="doneer";
				}
				break;
			case "doneer":
				window.cardLayout.show(window.pnl_body, "doneerScherm");
				input = input();
				
				System.out.println("Wilt u een euro doneren aan hongerige kinderen in Colombia?");
				
				if(input.equals("A")) {
					screens = "bon";
				}
				break;
                        case "blokkeer":
                            window.cardLayout.show(window.pnl_body, "blokScherm");
                            server.begin("BLOCK" + s);
                            try {
                                    Thread.sleep(5000);
                            } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                                    e.printStackTrace();
                            }
                            
                            break;
                            
                            default:
			}
		}
		
	}
	
		private String checkCard() {
			
			while(true) {
				String input = arduino.getInput();
				
				if (input != null) {
					System.out.println(input);
					if(input.length()>= 7) {
						return input;	
					}				
				}
                        }	
		}
	
		private String readPin() { // pincodeScherm
			String PIN = "";
			while(true) {
				String input = arduino.getInput();
				
				if (input != null) {
					
					System.out.println(input);
					if(input.equals("D")) {
						System.out.println("returning PIN "+ PIN);
						return PIN;
					}else if(PIN.length()<=4 && !Pattern.matches("[a-zA-Z]", input)) {
						PIN+=input;
					}
					
				}
	
			}
	
		}
		
                
		public boolean opnemen(int Geld) { //opneemScherm 
							
			if(Saldo >= Geld) { // Genoeg Saldo
				System.out.println("User took : " + Geld);
				//System.out.println("User took : " + bedrag);
				Geld = this.Geld;
                                System.out.println(Saldo);
                                return true;
									
				} else {
					System.out.println("Niet genoeg geld");
					return false;
				}
							
		}
			
			private String input() {
				
				while(true) {
					String input = arduino.getInput();
					
								if (input != null) {
									System.out.println(input);
									return input;
								}
				}
				
				
			}
}