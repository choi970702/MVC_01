package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Bye;
import com.ict.model.Command;
import com.ict.model.Hello;
import com.ict.model.Hi;


@WebServlet("/MyController")
public class MyController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		String path = null;
		Command comm = null;
		
		if (cmd.equalsIgnoreCase("hello")) 
		{
			comm = new Hello(); 
		}else if (cmd.equalsIgnoreCase("hi"))
		{
			comm = new Hi(); 
		}else if (cmd.equalsIgnoreCase("bye"))
		{
			comm = new Bye();
		}
		path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
		
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		
		int sum = Integer.getInteger("kor")+Integer.getInteger("eng")
				+Integer.getInteger("math");
		int avg = sum/3;
		String hak = "";
		if (avg>=90) 
		{
			hak = "A";
		}else if(avg>=80)
		{
			hak = "B";
		}else if(avg>=70)
		{
			hak = "C";
		}else
		{
			hak = "F";
		}
		
		request.getRequestDispatcher(name).forward(request, response);
		request.getRequestDispatcher(Integer.toString(sum)).forward(request, response);
		request.getRequestDispatcher(Integer.toString(avg)).forward(request, response);
		request.getRequestDispatcher(hak).forward(request, response);
		
	}

}
