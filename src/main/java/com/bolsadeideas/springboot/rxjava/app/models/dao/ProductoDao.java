package com.bolsadeideas.springboot.rxjava.app.models.dao;

import org.springframework.data.repository.reactive.RxJava2CrudRepository;

import com.bolsadeideas.springboot.rxjava.app.models.documents.Producto;

	//public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {
	public interface ProductoDao extends RxJava2CrudRepository<Producto, String> {
	
}
