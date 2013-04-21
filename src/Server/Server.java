package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import se.eda095.plumpkortspel.Card;
import se.eda095.plumpkortspel.StackHandler_Interaface;

public class Server {
	private ServerSocket serverSocket;
	public StackHandler_Interaface stackHandler;
	
	private int port = 7777;
	private ArrayList<Socket> connectedSockets;
	
	public Server() {
	connectedSockets = new ArrayList<Socket>();
		try {
			serverSocket = new ServerSocket(port);
			connectedSockets.add(serverSocket.accept());
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}


