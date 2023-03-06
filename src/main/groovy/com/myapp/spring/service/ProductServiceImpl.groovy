package com.myapp.spring.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.myapp.spring.domain.Product
import com.myapp.spring.repository.ProductRepository

@Service
class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository

	@Override
	List<Product> findAll() {
		productRepository.findAll()
	}

	@Override
	Product findById(Integer productId) {
		productRepository.findById productId get()
	}

	@Override
	Product saveProduct(Product product) {
		
		productRepository.save product
	}

	

	@Override
	Product deleteProduct(Integer productId){
		productRepository.deleteById productId
	}
}
