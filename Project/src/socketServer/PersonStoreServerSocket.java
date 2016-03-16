package socketServer;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket
{
	DataReader store;

	public void start()
	{
		try
		{
			System.out.println("Server starting...");

			ServerSocket serverSocket = new ServerSocket(5678);
			System.out.println("Waiting for client...");

			Socket server = serverSocket.accept();
			System.out.println("Client connected!");

			OutputStream os = server.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			InputStream is = server.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			server.close();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
