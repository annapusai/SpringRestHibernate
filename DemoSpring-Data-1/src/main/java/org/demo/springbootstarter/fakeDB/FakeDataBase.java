package org.demo.springbootstarter.fakeDB;

import java.util.HashMap;
import java.util.Map;

import org.demo.springbootstarter.products.Products;

public class FakeDataBase {
	
	private static Map<Integer,Products> products = new HashMap();
	
	public static Map<Integer,Products> getProducts(){
		return products;
	}

}
