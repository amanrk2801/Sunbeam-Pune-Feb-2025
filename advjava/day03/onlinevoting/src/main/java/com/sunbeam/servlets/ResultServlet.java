package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.entities.Candidate;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Candidate> list = null;
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			list = candDao.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		
		// get app title from context param (in web.xml) and display it
		ServletContext app = req.getServletContext();
		String title = app.getInitParameter("apptitle");
		out.println("<h2>"+title+"</h2>");

		// retrieve username from cookie and print it
		String uname = "";
		Cookie[] arr = req.getCookies();
		if(arr != null && arr.length > 0) {
			for(Cookie c : arr) {
				if(c.getName().equals("uname"))
					uname = c.getValue();
			}
		}
		out.println("Hello, " + uname + "<br/>");
		out.println("<div><a href='announcement.html'>Announcement</a></div>");
		out.println("<div><a href='logout'>Sign Out</a></div>");

		out.println("<h3>Candidate List</h3>");
		out.println("<table border='1'>");
		out.println("<thead>");
		out.println("<tr>");
		out.printf("<th>Id</th>\n");
		out.printf("<th>Name</th>\n");
		out.printf("<th>Party</th>\n");
		out.printf("<th>Votes</th>\n");
		out.printf("<th>Action</th>\n");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		for(Candidate c:list) {
			out.println("<tr>");
			out.printf("<td>%d</td>\n", c.getId());
			out.printf("<td>%s</td>\n", c.getName());
			out.printf("<td>%s</td>\n", c.getParty());
			out.printf("<td>%d</td>\n", c.getVotes());
			out.printf("<td><a href='delcand?candid=%d'>Delete</a></td>\n", c.getId());
			out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("</table>");		
		out.println("</body>");
		out.println("</html>");				
	}
}
