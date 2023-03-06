package com.myapp.spring.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor(force=true)
@ToString
@EqualsAndHashCode
@Entity
@Table(name="products")

class Product implements Serializable {
	
	





		@Id
	
	   @GeneratedValue(strategy = GenerationType.AUTO)
	
	   @Column(name="PRODUCT_ID")
	
		Integer productId;
	
	   
	
	   
	
	   @Column(name="PRODUCT_NAME",nullable = false)
	
		String productName;
	
	   
	
	   
	
	   @Column(name="PRODUCT_DESCRIPTION",nullable = false)
	
		String description;
	
	   
	
	   
	
	   @Column(name="PRODUCT_PRICE",nullable = false)
	
		Double price;
	
	   
	
	   
	
	   @Column(name="PRODUCT_RATING",nullable = false)
	
	   Double starRating;
	
}
