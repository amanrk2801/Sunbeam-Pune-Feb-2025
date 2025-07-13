package com.sunbeam.pages;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.sunbeam.dao.UserDaoImpl;
import com.sunbeam.pojos.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet(value = "/", loadOnStartup = 1)
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		
			// 1. create dao instance
			userDao = new UserDaoImpl();
			System.out.println("init successful !");
		
	}

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// dev steps
			// 1. get request path
			// URL http://host:port/ctx/
			String path = request.getServletPath();// "/"
			String viewName = null;
			String prefix = "/WEB-INF/views/";
			String suffix = ".jsp";
			switch (path) {
			case "/": // render user list
				// add results (user list) - under request scope
				request.setAttribute("user_list", listUsers());
				viewName = "list";
				break;
			case "/delete":
				System.out.println(deleteUserDetailsById(request));
				// redirect the client in the next request
				response.sendRedirect("./");
				return;
			case "/add":
				// show user signup form
				viewName = "signup";
				break;
			// Request URL -> http://host:port/ctx_path/process_add
			case "/process_add":
				System.out.println(addNewUser(request));
				// redirect client to the root ctx path (./) in the next request
				response.sendRedirect("./");
				return;
			case "/update":
				showUpdateForm(request);
				// forward the clnt -
				viewName = "update_form";
				break;
			case "/process_update":
				System.out.println(updateUser(request));
				//redirect
				response.sendRedirect("./");
				return;

			}
			if (viewName != null) {
				RequestDispatcher rd = request.getRequestDispatcher(prefix + viewName + suffix);// AVN -
				// /WEB-INF/views/update_form.jsp
				rd.forward(request, response);
				System.out.println("control comes back after forward");
			}
		} catch (Exception e) {
			throw new ServletException("err in do-get of " + getClass(), e);
		}
	}

	private String updateUser(HttpServletRequest request)  {
		// 1. req params -> parse

		int userId = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("pass");
		Date newDob = Date.valueOf(request.getParameter("dob"));
		// invoke dao's method
		return null;
			//	userDao.updateUserDetails(userId, password, newDob);
	}

	private void showUpdateForm(HttpServletRequest request)  {
		// 1. get id - from query string param
		Long userId = Long.parseLong(request.getParameter("id"));
		// 2. controller -> dao
		User userDetails = userDao.getUserDetails(userId);
		// 3. store user details under request scope
		request.setAttribute("user_details", userDetails);
	}

	// override doPost - form processing
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// simply invoke doGet -> to delegate the processing
		doGet(req, resp);
	}

	private String addNewUser(HttpServletRequest request)  {
		// 1. req params -> parse -> encap in instance
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pass");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		User user = new User(firstName, lastName, email, pwd, dob);
		// 2. invoke dao's method
		return userDao.signUp(user);
	}

	private String deleteUserDetailsById(HttpServletRequest request)  {
		// parsing re param - user id
		Long userId = Long.parseLong(request.getParameter("id"));
		// invoke dao's method
		return userDao.deleteUser(userId);
	}

	private List<User> listUsers()  {
		// invoke dao's method
		return userDao.listUsers();

	}

}
