package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("LifeCycleServlet.init() called.");
//		try {
//			Connection con = DriverManager.getConnection("someurl", "user", "passwd");
//			// JDBC code ...
//		} catch (SQLException e) {
//			throw new ServletException(e);
//		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet.doGet() called.");
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("service() --> doGet() called...");
	}
	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet.destroy() called.");
	}
}
