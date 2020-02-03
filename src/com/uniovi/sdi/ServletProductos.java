package com.uniovi.sdi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletProductos
 */
@WebServlet("/productos")
public class ServletProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletProductos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		List<String> productosTienda = (ArrayList<String>) request.getSession().getAttribute("productosTienda");

		// No hay productos en la Tienda, creamos uno y lo insertamos en sesión
		if (productosTienda == null) {
			productosTienda = new ArrayList<String>();
			request.getSession().setAttribute("productosTienda", productosTienda);
		}

		String producto = request.getParameter("producto");
//		if (producto != null) {
//			insertarEnProductos(productosTienda, producto);
//		}

		// Retornar la vista con parámetro "productosTienda"
		request.setAttribute("paresProductosTienda", productosTienda);
		getServletContext().getRequestDispatcher("/vista-productos.jsp").forward(request, response);
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
