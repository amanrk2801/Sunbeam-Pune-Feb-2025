package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entities.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/announce")
public class AnnouncementServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get announcement from prev page
		String ann = req.getParameter("ann");
		// store in in servletcontext
		ServletContext ctx = this.getServletContext();
		ctx.setAttribute("announcement", ann);
		// go to result page
		//RequestDispatcher rd = req.getRequestDispatcher("result"); // url is w.r.t. current path
		RequestDispatcher rd = ctx.getRequestDispatcher("/result"); // "/" represent root of web appln
																	// url is w.r.t. "/" app root
		rd.forward(req, resp);
	}
}
