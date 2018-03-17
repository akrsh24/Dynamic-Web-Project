package com.sapient.pm.repository;

import java.util.List;

import com.sapient.pm.model.Product;

public interface ProductRepository {

	void save(Product product);

	Product find(int i);

	List<Product> findAll();

	void update(int id, double price);

	void delete(int id);
}
