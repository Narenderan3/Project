package test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		email.trim();
		password.trim();
		if (email.isEmpty()) {
			request.getRequestDispatcher("login.html").include(request, response);
			out.print("<center>Enter the Email Address</center>");
		} else if (password.isEmpty()) {
			request.getRequestDispatcher("login.html").include(request, response);
			out.print("<center>Enter the password</center>");
		}
		boolean flag = false;
		for (SignupClass sc : Signup.implement.ClassList) {
			String mail = sc.getEmail();
			if (mail.equals(email)) {
				flag = true;
				if (password.equals(sc.getPassword())) {
					// redirect to home page
					HttpSession session = request.getSession();
					session.setAttribute("email", email);
					response.sendRedirect("content.html");
				} else {
					// Send redirect to login page and say password is wrong
					request.getRequestDispatcher("login.html").include(request, response);
					out.print("<center>Password is wrong</center>");
				}
			}
		}
		if (!flag && email != null && password != null) {
			// send redirect to login and say email is wrong or not present
			request.getRequestDispatcher("login.html").include(request, response);
			out.print("s<center>First signup and then login</center>");
		}
	}

}
