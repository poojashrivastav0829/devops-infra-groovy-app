package com.myapp.spring.repository



import org.springframework.data.jpa.repository.JpaRepository

import com.myapp.spring.domain.Product



interface ProductRepository extends JpaRepository<Product,Integer> {
	
	// select * from products where productName=?
	def findByProductName(productName)
	
}


// JSON ARRAY  []

// JSON OBJECT {"":}

// JSON NUMBER 

// JSON STRING

// JSON BOOLEAN true|false
