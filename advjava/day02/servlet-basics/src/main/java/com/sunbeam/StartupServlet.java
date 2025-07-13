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

//@WebServlet(value="/first", loadOnStartup=1)
public class StartupServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("StartupServlet.init() called.");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("StartupServlet.doGet() called.");
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		out.println("StartupServlet doGet() called...");
	}
	@Override
	public void destroy() {
		System.out.println("StartupServlet.destroy() called.");
	}
}
