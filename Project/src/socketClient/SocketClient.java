package socketClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient
{

	public SocketClient()
	{
		String serverName = "localhost";
		int port = 5678;
		try
		{
			System.out.println("Connecting to " + serverName + " on port " + port);
			Socket client = new Socket(serverName, port);
			System.out.println("Connected!");

			OutputStream outToServer = client.getOutputStream();

			InputStream inFromServer = client.getInputStream();

			client.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
