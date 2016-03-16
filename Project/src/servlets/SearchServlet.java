package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import socketClient.SocketClient;

public class SearchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public SearchServlet()
	{
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("In post method!");

		String criterias = request.getParameter("criterias");
		String searchType = request.getParameter("searchType");
		System.out.println(criterias + "\n" + searchType);

		SocketClient client = new SocketClient("localhost", 5678);

	}

}
