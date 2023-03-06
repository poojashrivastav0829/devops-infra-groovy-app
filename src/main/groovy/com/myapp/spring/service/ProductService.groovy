package com.myapp.spring.service

import com.myapp.spring.domain.Product

interface ProductService {
	
	List<Product> findAll()
	
		Product findById(Integer productId)
	
		Product saveProduct(Product product)
	
		
	
		Product deleteProduct(Integer productId)
}


// Linux and Fundamentals (Centos and Redhat)
// Devops
// Git and Github
// Jenkins
// Containerization & Virtualization
// Docker and Kubernetes
// Code Quality and Configuration
// Monitoring
// IAC (Terraform and Ansible)




