package com.pro.ecom.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.ecom.Model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
	

}
