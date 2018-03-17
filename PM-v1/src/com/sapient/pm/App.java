package com.sapient.pm;

import java.util.Date;
import java.util.List;

import com.sapient.pm.model.Product;
import com.sapient.pm.repository.ProductRepositoryImpl;
import com.sapient.pm.repository.ProductRepository;

public class App {

	public static void main(String[] args) {

		ProductRepository productRepository = new ProductRepositoryImpl();

		// ---------------------------------------------------

//		 Product product = new Product();
//		 product.setName("Laptop");
//		 product.setPrice(118000.00);
//		 product.setMakedate(new Date());
//		 product.setDesc("Mac Pro");
//		 productRepository.save(product);

		// ---------------------------------------------------

//		 Product product = productRepository.find(1);
//		 System.out.println(product);

		// ---------------------------------------------------

//		 List<Product> products=productRepository.findAll();
//		 for(Product product:products) {
//		 System.out.println(product);
//		 }

		// ----------------------------------------------------

//		 productRepository.update(2, 1000.00);

		// ----------------------------------------------------

//		 productRepository.delete(3);

	}

}