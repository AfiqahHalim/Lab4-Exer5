package Multilingual;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientSide {

	public static void main(String[] args) {
					
		try {
			
			//Object to input data from user
			Socket socket = new Socket(InetAddress.getLocalHost(),2356);
			
			//scanner to accept data from user
			Scanner b = new Scanner(System.in);
			
			//OS to send data to server
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+                 Client Side                  +");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(" ");
			
			//data from user
			System.out.print("Please Enter Words In English: ");
			String text =(b.nextLine());
			
			//to send data that enter by user to server
			outputStream.writeUTF(text);
			outputStream.flush();
		
			//IS to read result from server
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			
			//object to read result from result using UTF
			String translatedText = inputStream.readUTF();
		
			System.out.println("\nTranslated text: " );
			System.out.println("\nMalay               Arabic         Korean");
			//to display result of translated from server
			System.out.println(translatedText);
 			
			//Close all object
			outputStream.close();
			b.close();
			socket.close();
			inputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
