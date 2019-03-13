package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Kart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String name;
	static int price = 0;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		// HttpSession session = request.getSession(false);
		// if(session!=null)
		// {
		// String email=(String)request.getAttribute("email");
		// }
		// else
		// {
		//
		// }
		out.println("<html><head><style> img { position: absolute; left: 600px; top: 80px; margin: 0 auto;"
				+ "	padding: 20px; width: 150px; height: 200px; } "
				+ ".text { position : absolute; left:660px; top:330px; } "
				+ ".rupee { position:absolute; left:640px; top:360px; }"
				+ " button{ position:absolute; left:640px; top:420px; }"
				+ " a{ position:absolute; left:650px; top:450px;}"
				+ ".option{ position:absolute; left:760px; top:360px;}" + "</style><body>");
		out.print("<form action='add' method='post'>");
		name = request.getParameter("phone");
		if (name.equals("Redmi 4")) {
			price = 6000;
			out.print(
					"<img src='https://www.91-img.com/gallery_images_uploads/d/a/da11d00c5a700c4a1c68e6df88c65c81de685384.jpg?w=0&h=901&q=80&c=1' alt='Redmi 4 16GB'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:6000/phone</p>");
		}
		if (name.equals("Redmi 4A")) {
			price = 7500;
			out.print(
					"<img src='https://www.91-img.com/gallery_images_uploads/f/8/f8bb2da448d54f48ebabf60e335f4fff9cbf49ab.jpg?w=0&h=901&q=80&c=1'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:7500/phone </p>");
		}
		if (name.equals("Redmi Note 4")) {
			price = 9000;
			out.print(
					"<img src='https://www.91-img.com/pictures/103712-v2-xiaomi-redmi-note-4-64gb-mobile-phone-large-1.jpg' alt='Redmi note 4'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:9000/phone </p>");
		}
		if (name.equals("Redmi 5")) {
			price = 10000;
			out.print("<img src='https://img.ksp.co.il/item/46343/b_3.jpg' alt='Redmi 5'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:10000/phone </p>");
		}
		if (name.equals("Redmi Note 5A")) {
			price = 12000;
			out.print(
					"<img src='https://images.locanto.net/Redmi-5A-32-GB-SEALED-PACK/tn_3385081571.jpg' alt='Redmi note 5A 32GB'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:12000/phone </p>");
		}
		if (name.equals("Redmi 5 Plus")) {
			price = 12500;
			out.print(
					"<img src='https://www.91-img.com/gallery_images_uploads/1/1/1169a542565c73526a14d4c4ab88fdeef938dbc8.jpg?w=0&h=901&q=80&c=1' alt='Redmi 5 Plus'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:12500/phone </p>");
		}
		if (name.equals("Redmi 6A")) {
			price = 13000;
			out.print(
					"<img src='https://www.91-img.com/gallery_images_uploads/8/b/8bb56152c1a9a1d86bea7eeb39c00825635a6919.jpg?w=0&h=901&q=80&c=1' alt='Redmi 6A'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:13000/phone </p>");
		}
		if (name.equals("Redmi Note 6")) {
			price = 16000;
			out.print(
					"<img src='https://www.91-img.com/pictures/127598-v11-xiaomi-redmi-6-pro-mobile-phone-medium-1.jpg' alt='Redmi Note 6'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:16000/phone </p>");
		}
		if (name.equals("Redmi Note 6 Pro")) {
			price = 16500;
			out.print(
					"<img src='https://www.91-img.com/pictures/129556-v10-xiaomi-redmi-note-6-pro-mobile-phone-medium-1.jpg' alt='Redmi Note 6 Pro'>");
			out.print("<p class='text'>" + name + "</p>");
			out.print("<p class='rupee'> Rs:16500/phone </p>");
		}
		out.print("<p class='option'><input type='number' minlength='1' name='value'></p>");
		out.print("<button> Add to kart</button>");
		out.print("<a href='content.html'>shop more</a>");
		out.println("</head></form></body></html>");

	}
}
