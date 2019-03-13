package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class ServletInterface implements Servlet {

	ServletConfig config = null;

	@Override
	public void destroy() {
		System.out.println("Destroy method called:");

	}

	@Override
	public ServletConfig getServletConfig() {
		return config;

	}

	@Override
	public String getServletInfo() {

		return "copyright 1.9.2018 version.3.0";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Init method is called:");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service method is called:");
		PrintWriter out = response.getWriter();
		out.print("<b>hello simple servlet</b>");
		out.print("<br>");
		out.print("<b>Servlet Info :</b> " + getServletInfo());
		out.print("<br>");
		out.print("<b>Get Servlet config object :</b> " + getServletConfig());

	}

}
