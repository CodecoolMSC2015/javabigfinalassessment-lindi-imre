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

	ServerSocket serverSocket;

	public PersonStoreServerSocket(int port)
	{
		try
		{
			System.out.println("Server starting...");
			serverSocket = new ServerSocket(port);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void start()
	{
		while (true)
		{
			try
			{
				System.out.println("Waiting for client...");
				Socket server = serverSocket.accept();
				System.out.println("Client connected!");

				OutputStream os = server.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);

				InputStream is = server.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);

				// Close connections
				oos.close();
				ois.close();
				os.close();
				is.close();
				server.close();

			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args)
	{
		PersonStoreServerSocket server = new PersonStoreServerSocket(5678);
		server.start();
	}
}
