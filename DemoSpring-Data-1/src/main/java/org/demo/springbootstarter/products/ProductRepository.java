package org.demo.springbootstarter.products;

import org.springframework.data.repository.CrudRepository;

//Apache Derby is the Database
//Using CrudRepository for CRUD operations
public interface ProductRepository extends CrudRepository<Products,Integer> {

}
