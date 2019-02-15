package com.dao;

import java.util.List;

import com.bean.Product;

public interface ProductDao {
	public boolean addProduct(Product product) ;
	public List<Product> showAllProduct ();
	public boolean deleteProduct();
}
