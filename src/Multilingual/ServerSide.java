package Multilingual;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

	public class ServerSide {

		
		public static void main(String[] args) throws Exception {
			
			
			ServerSocket serverSocket = null;
			
			try {
					    
				
				//to bind the Serversocket to the port
				int portNo = 2356;
				serverSocket = new ServerSocket(portNo);
				
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("+                 Server Side                +");
				System.out.println("+                ...Running...               +");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				
				
				while(true) {
					
					//to accept request from client
					Socket socket = serverSocket.accept();
					
					//stream for read data from client
					DataInputStream inputStream = new DataInputStream(socket.getInputStream());
					
					//new object for translator
					Translator message = new Translator();
					 message.setText(inputStream.readUTF()); 
					 
					 //object to store message
					 String text = message.getTranslate();
					 
					 //object to translate text enter by user
					Translator textToTranslate = new Translator(text);
					
					//stream for write data to the network
					DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
					
					//to send the result back to the client
					outputStream.writeUTF(textToTranslate.getTranslate());
					outputStream.flush();
									
					//close all object
					socket.close();
					inputStream.close();
					outputStream.close();
				
				}
				
				
			}catch(IOException ioe) {
				
				if(serverSocket != null)
					serverSocket.close();
				
				ioe.printStackTrace();
				
			}

		}

	}
