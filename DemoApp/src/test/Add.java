package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	public static ArrayList<Integer> kartList = new ArrayList<>();
	public static ArrayList<String> kartProduct = new ArrayList<>();
	public static ArrayList<Integer> kartPrice = new ArrayList<>();
	public static ArrayList<Integer> kartAmount = new ArrayList<>();
	public static Set<String> set = new HashSet<>();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String number = request.getParameter("value");
		number.trim();
		String name = Kart.name;
		int value = Kart.price;
		kartProduct.add(name);
		int price = 0, amount = 0;
		if (number == null) {
			request.getRequestDispatcher("/content").include(request, response);
			out.print("<p align='center'>Mention the amount of phone required</p>");
		} else {
			amount = Integer.parseInt(number);
			kartAmount.add(amount);
			price = addCartItem(name, amount, value);
			kartPrice.add(price);
		}
		int total = calculateTotalPrice();
		out.print("<html><head> <style> a{ position:absolute; left:650px; top:450px;} "
				+ "</style><body><p align='center'>" + "Product----------Quantity------Price</p>");
		for (int counter = 0; counter < kartProduct.size(); counter++) {
			out.print("<p align='center'>" + kartProduct.get(counter) + "---------" + kartAmount.get(counter) + "------"
					+ kartPrice.get(counter) + "</p>");
		}

		out.print("<p align:'center'>" + total + "</p>");
		out.print("<p><a href='content.html'>Add More</p></a>");
		out.print("</head></body></html>");
	}

	public int addCartItem(String name, int quantity, int price) {
		int totalPrice = 0;
		totalPrice = price * quantity;
		kartList.add(totalPrice);
		return totalPrice;
	}

	protected int calculateTotalPrice() {
		int intTotal = 0;
		for (int counter = 0; counter < kartList.size(); counter++) {
			intTotal += kartPrice.get(counter);
		}
		return intTotal;
	}

}
