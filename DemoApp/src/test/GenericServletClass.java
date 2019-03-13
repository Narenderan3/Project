package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class GenericServletClass extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method is called:");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service method is called:");
		PrintWriter out = response.getWriter();
		out.print("<b>hello simple GenericServlet Class</b>");
		out.print("<br>");
	}

}
