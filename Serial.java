/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

public class Serial implements Runnable{
	
	volatile String serialData = null;
	volatile boolean inputAvailable = false;
	volatile String input = null;
	Serial() {
	}
	@Override
	public void run() {
		try {
		// TODO Auto-generated method stub
		SerialPort comPort = SerialPort.getCommPort("COM5");
		
		//set the baud rate to 9600 (same as the Arduino)
		comPort.setBaudRate(9600);
		
		//open the port
		comPort.openPort();
		
		//create a listener and start listening
		comPort.addDataListener(new SerialPortDataListener() {
			@Override
			public int getListeningEvents() { 
				return SerialPort.LISTENING_EVENT_DATA_AVAILABLE; 
			}
			@Override
			public void serialEvent(SerialPortEvent event)
			{
				if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE)
				return; //wait until we receive data
			
				byte[] newData = new byte[comPort.bytesAvailable()]; //receive incoming bytes
				comPort.readBytes(newData, newData.length); //read incoming bytes
				serialData = new String(newData); //convert bytes to string
				serialData = serialData.replaceAll("[^A-Za-z0-9]", "");
				serialData = serialData.replace("\n","");
				input = serialData;
				inputAvailable = true;
				
				//print string received from the Arduino
				//System.out.println(serialData);
			}
		});}catch(Exception e) {
			e.printStackTrace();
		}
	}
	String getInput() {
		if (inputAvailable) {
			inputAvailable = false;
			return input;
		}
		return null;
	}
}