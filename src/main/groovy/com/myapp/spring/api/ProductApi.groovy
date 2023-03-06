package com.myapp.spring.api



import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.DeleteMapping

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.PathVariable

import org.springframework.web.bind.annotation.PostMapping

import org.springframework.web.bind.annotation.PutMapping

import org.springframework.web.bind.annotation.RequestBody

import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController



import com.myapp.spring.domain.Product

import com.myapp.spring.repository.ProductRepository

import com.myapp.spring.service.ProductService



@RestController

@RequestMapping("products")

class ProductApi {



	@Autowired



	ProductService ProductService











	@GetMapping("/home")



	String index(){



		"Home "
	}









	@GetMapping



	def getAllProductList(){



		ProductService.findAll()
	}









	@PostMapping



	Product saveProduct(@RequestBody Product product){



		ProductService.saveProduct product
	}









	@PutMapping('/{productId}')



	Product updateProduct(@PathVariable Integer productId, @RequestBody Product product){



		ProductService.updateProduct productId, product
	}









	@DeleteMapping('/{productId}')



	def deleteProduct(@PathVariable Integer productId){



		ProductService.deleteProduct productId
	}









	@GetMapping('/{productId}')



	Product getProductById(@PathVariable Integer productId){



		ProductService.findById productId
	}



	// GET

	// POST

	// PUT

	// DELETE

	// TRACES

	// OPTIONS
}