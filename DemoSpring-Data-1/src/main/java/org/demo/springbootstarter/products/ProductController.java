package org.demo.springbootstarter.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Products> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@RequestMapping("/products/{id}")
	public Products getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/products")
	public void addProduct(@RequestBody Products product)
	{
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/products/{id}")
	public void updateProduct(@RequestBody Products product,@PathVariable int id)
	{
		//product.setProductId(id);
		productService.updateProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/products/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productService.removeProduct(id);
	}
	
	

}
