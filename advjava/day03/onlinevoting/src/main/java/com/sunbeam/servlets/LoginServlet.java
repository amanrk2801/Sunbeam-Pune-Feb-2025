package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.entities.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String passwd = req.getParameter("passwd");
		try(UserDao userDao = new UserDaoImpl()) {
			User dbUser = userDao.findByEmail(email);
			if(dbUser != null && dbUser.getPassword().equals(passwd)) {
				// login successful - create cookie of user name & send to client
				Cookie c = new Cookie("uname", dbUser.getFirstName()+dbUser.getLastName());
				c.setMaxAge(3600); // 1 hour
				resp.addCookie(c);
				
				// login successful - store user obj in session
				HttpSession session = req.getSession();
				session.setAttribute("user", dbUser);
				
				if(dbUser.getRole().equals("admin"))
					// HTTP redirection
					resp.sendRedirect("result"); // go to result servlet
				else {
					// HTTP redirection (PRG - better)
					resp.sendRedirect("candlist"); // go to candlist servlet
				}
			}
			else {
				resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Failed</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("Invalid email or password.");
				out.println("<br/>");
				out.println("<a href='index.html'>Login again</a>");
				out.println("</body>");
				out.println("</html>");				
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
