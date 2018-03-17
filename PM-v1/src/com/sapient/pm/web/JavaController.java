package com.sapient.pm.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.pm.model.Product;
import com.sapient.pm.repository.ProductRepository;
import com.sapient.pm.repository.ProductRepositoryImpl;

@WebServlet(urlPatterns = { "/load-products", "/save-product", "/delete-product" })
public class JavaController extends HttpServlet {

	ProductRepository productRepository = new ProductRepositoryImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uri = req.getRequestURI();
		String path = uri.substring(uri.lastIndexOf('/'));
		if (path.equals("/load-products")) {
			List<Product> products = productRepository.findAll();
			req.setAttribute("products", products);
			req.getRequestDispatcher("pm.jsp").forward(req, resp);
		}
		if (path.equals("/delete-product")) {
			String id = req.getParameter("id");
			productRepository.delete(Integer.parseInt(id));
			resp.sendRedirect("load-products");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Product product = new Product();

		// INPUT
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String make_date = req.getParameter("make_date");
		String description = req.getParameter("description");

		// MAPPING PARAMETERS TO OBJECT MODEL
		product.setName(name);
		product.setPrice(Double.parseDouble(price));
		product.setDesc(description);

		try {
			product.setMakedate(new SimpleDateFormat("yyyy-MM-dd").parse(make_date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		productRepository.save(product);

		resp.sendRedirect("load-products");

	}
}
