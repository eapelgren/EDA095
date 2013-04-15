package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ConnectionHandler implements Runnable {
	private Socket theclient;
	ServerSocket serverSocket = null;

	public ConnectionHandler(Socket theclient) {
		this.theclient = theclient;

		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(theclient.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					theclient.getInputStream()));
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));

			String inputLine, outputLine;
			while ((inputLine = in.readLine()) != null) {
				out.println();

				System.out.println("From Client:" + inputLine);
				outputLine = input.readLine();
				out.println(outputLine);

				if (inputLine.equals("Bye"))
					break;
			}
			out.flush();

			out.close();
			in.close();
			theclient.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}