package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket server;
	private int port = 7777;

	public Server() {
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server example = new Server();
		example.handleConnection();
	}

	public void handleConnection() {
		System.out.println("Waiting for client message...");

		while (true) {
			try {
				Socket socket = server.accept();
				ConnectionHandler cd = new ConnectionHandler(socket);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}