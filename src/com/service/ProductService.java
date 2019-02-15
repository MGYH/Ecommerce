package com.service;

import java.util.List;

import com.bean.Product;

public interface ProductService {
	public boolean addProduct(Product product);
	public List<Product> showAllProduct();
}
