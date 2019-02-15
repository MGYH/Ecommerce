package com.service.serviceImpl;

import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;
import com.dao.DaoImpl.ProductDaoImpl;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Override
	public boolean addProduct(Product product){
		ProductDao productDao = new ProductDaoImpl();
		return productDao.addProduct(product);
	}

	@Override
	public List<Product> showAllProduct(){
		ProductDao productDao = new ProductDaoImpl();
		return productDao.showAllProduct();
	}
	
}
