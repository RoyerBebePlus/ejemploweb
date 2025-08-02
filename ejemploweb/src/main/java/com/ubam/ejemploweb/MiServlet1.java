package com.ubam.ejemploweb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/miServlet1")
public class MiServlet1 extends HttpServlet{

	public MiServlet1() {
		// TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
    ServletException, IOException{
    String nombre = req.getParameter("nombre");
    resp.setContentType("text/html");
    PrintWriter writer=resp.getWriter();
    writer.print("<h1> Hola: " + nombre + "</h1>");
    }
}
