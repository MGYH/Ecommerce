package com.product;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Product;
import com.utils.HibernateUtils;

public class ProductManage {
	public boolean add(String name,String cost, String price) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		try {
			Product product = new Product();
			
			product.setName(name);
			product.setCost(cost);
			product.setPrice(price);
			session.save(product);
			tr.commit();
			return true;
			
		} catch(Exception e) {
			tr.rollback();
			return false;
		} finally {
			session.close();
		}
	}
	public List<Product> selectAll() {
		Session session = HibernateUtils.openSession();
		Transaction tr = session.beginTransaction();
	
		Query query = session.createQuery("from Product");
	
		
		List<Product> list = query.list();
		
		tr.commit();
		session.close();
		for (Product customer : list) {
			System.out.println(customer);
		}
		return list;
	}
}
