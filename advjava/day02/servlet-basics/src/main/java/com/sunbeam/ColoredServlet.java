package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(value="/colored", initParams = {
//	@WebInitParam(name="color", value="pink"),
//	@WebInitParam(name="greet", value="Hi"),
//})
public class ColoredServlet extends HttpServlet {
	private String color;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		color = config.getInitParameter("color");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Colored</title>");
		out.println("</head>");
		//color = this.getInitParameter("color");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("Hello, ColoredServlet");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
	}
}
