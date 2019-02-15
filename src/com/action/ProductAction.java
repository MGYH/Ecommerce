package com.action;

import java.util.List;

import com.bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.ProductService;
import com.service.serviceImpl.ProductServiceImpl;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product = new Product();
	public String findAll() {
		ProductService productService = new ProductServiceImpl();
		List<Product> list = productService.showAllProduct();
		ActionContext.getContext().getValueStack().set("list", list);
		return SUCCESS;
	}
	public String addProduct() {
		ProductService productService = new ProductServiceImpl();
		if(productService.addProduct(product)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
		
	}
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
}
