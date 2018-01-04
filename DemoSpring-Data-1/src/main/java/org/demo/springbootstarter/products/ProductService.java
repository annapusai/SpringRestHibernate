package org.demo.springbootstarter.products;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.demo.springbootstarter.fakeDB.FakeDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
//private static Map<Integer,Products> product = FakeDataBase.getProducts();
//	
//	static{
//		product.put(1,new Products(1,"Product1"));
//		product.put(2,new Products(2,"Product2"));
//	}
	
	public List<Products> getAllProducts()
	{
		//return new ArrayList<Products>(product.values());
		List<Products> productList = new ArrayList();
		 productRepository.findAll().forEach(productList :: add);
		 return productList;
	}
	
	public Products getProduct(int id) 
	{
		//return product.get(id);
		return productRepository.findOne(id);
	}
	
	public Products addProduct(Products pro)
	{
//		pro.setProductId(product.size()+1);
//		product.put(pro.getProductId(), pro);
//		return pro;
		return productRepository.save(pro);
	}
	
	public Products updateProduct(Products pro)
	{
//		if(pro.getProductId()<=0) {
//			return null;
//		}
//		product.put(pro.getProductId(), pro);
//		return pro;
		return productRepository.save(pro);
	}
	
	public void removeProduct(int id)
	{
		//return product.remove(id);
		 productRepository.delete(id);
	}
	
}
