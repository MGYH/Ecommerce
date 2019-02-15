package com.product;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Product;
import com.utils.HibernateUtils;

public class CustomerManage {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
