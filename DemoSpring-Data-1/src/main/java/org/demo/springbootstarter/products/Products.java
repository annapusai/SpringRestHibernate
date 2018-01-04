package org.demo.springbootstarter.products;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Id
	int  productId;
	private String productName;
	public Products()
	{
		
	}
	
	public Products(int productId,String productName)
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
