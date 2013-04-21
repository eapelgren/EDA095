package Server;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import java.util.Stack;

import se.eda095.plumpkortspel.StackHandler_Interaface;

public class ServerThread extends Thread {
	private Socket socket;
	private BufferedOutputStream toClient;
	private BufferedReader fromClient;
	private StackHandler_Interaface stackHandler;
	private Server server;
	
	public ServerThread(Socket Socket, Server Server){
		this.socket = Socket;
		this.server = Server;
	
		try {
			fromClient = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			toClient = new BufferedOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {

		while (true) {
			try {
				String message = fromClient.readLine();
				int messageInt = Integer.parseInt(message);
				int stackId = messageInt / 100; //Sätter värde 1 eller 2
				int card = messageInt % 100; // Ex. kort 35
				Stack stack = new Stack(stackId);
				stackHandler.setCard(card, stack)
				Thread.yield();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public void killThread() {
		try {
			this.join(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public int checkCard(String cardValue){
		stackHandler.setCard(card, stack)
		

}



	
	

