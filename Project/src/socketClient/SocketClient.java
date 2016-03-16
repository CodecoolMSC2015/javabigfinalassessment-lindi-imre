package socketClient;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient
{

	public SocketClient(String serverName, int port)
	{
		try
		{
			System.out.println("Connecting to " + serverName + " on port " + port);
			Socket client = new Socket(serverName, port);
			System.out.println("Connected!");

			OutputStream os = client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);

			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			oos.close();
			ois.close();
			os.close();
			is.close();
			client.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		SocketClient client = new SocketClient("localhost", 5678);
	}
}
