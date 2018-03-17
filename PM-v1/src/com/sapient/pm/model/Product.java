package com.sapient.pm.model;

import java.util.Date;

public class Product {
	
	int id;
	String name;
	double price;
	Date makedate;
	String desc;
	public Product(){}
	public Product(int id, String name, double price, Date makedate, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.makedate = makedate;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getMakedate() {
		return makedate;
	}
	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", makedate=" + makedate + ", desc=" + desc
				+ "]";
	}
}
