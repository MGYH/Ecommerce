package com.dao.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Product;
import com.dao.ProductDao;
import com.utils.HibernateUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean addProduct(Product product){
		Session session = HibernateUtils.openSession();
		Transaction tr = session.beginTransaction();
		try {
		session.save(product);
		tr.commit();
		session.close();
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Product> showAllProduct(){
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

	@Override
	public boolean deleteProduct(){
		// TODO Auto-generated method stub
		return false;
	}

}
