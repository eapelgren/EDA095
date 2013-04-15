package se.eda095.plumpkortspel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public static Socket clientSocket = null;
	public static PrintWriter out = null;
	public static BufferedReader in = null;
	public static int port = 0;
	static InetAddress mcAddress = null;

	public static void main(String[] args) {
		try {
			mcAddress = InetAddress.getByName("localhost");
			port = Integer.parseInt("7777");
			clientSocket = new Socket("localhost", port);
			out = new PrintWriter(clientSocket.getOutputStream(), true);

			in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));

			String userInput;
			String inetAddress = clientSocket.getInetAddress().getHostName();
			out.println(inetAddress);
			while ((userInput = input.readLine()) != null) {
				out.println(userInput);
				System.out.println("From Server: " + in.readLine());
				out.flush();
			}

			out.close();
			in.close();
			input.close();
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}