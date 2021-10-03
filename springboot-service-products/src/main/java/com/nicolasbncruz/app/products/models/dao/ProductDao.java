package com.nicolasbncruz.app.products.models.dao;

import com.nicolasbncruz.app.products.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {

}
