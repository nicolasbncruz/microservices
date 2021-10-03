package com.nicolasbncruz.app.products.models.service;

import com.nicolasbncruz.app.products.models.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();
    public Product findById(Long id);

}
