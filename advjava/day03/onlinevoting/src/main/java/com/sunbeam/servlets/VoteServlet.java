package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
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

@WebServlet("/vote")
public class VoteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Vote</title>");
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

		// get announcement from servlet context and display it.
		ServletContext ctx = req.getServletContext();
		String ann = (String) ctx.getAttribute("announcement");
		if(ann != null)
			out.println("ATTENTION: " + ann + "<br/>");

		// get candidate id from req param
		int candId = Integer.parseInt(req.getParameter("candidate"));
		// get current user from session
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		// check if user already voted
		if(user.getStatus() != 0) {
			// already voted
			out.println("Already voted.");
		}
		else {
			// vote to candidate
			// user status = 1
			try(UserDao userDao = new UserDaoImpl()) {
				user.setStatus(1);
				userDao.update(user);
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
			// increment vote count of candidate
			try(CandidateDao candDao = new CandidateDaoImpl()) {
				candDao.incrVote(candId);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
			
			out.println("Your vote registered.");
		}
		
		out.println("<br/><br/><a href='logout'>Sign Out</a>");
		out.println("</body>");
		out.println("</html>");				
	}
}
