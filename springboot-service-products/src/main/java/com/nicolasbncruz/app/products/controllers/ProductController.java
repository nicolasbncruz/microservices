package com.nicolasbncruz.app.products.controllers;

import com.nicolasbncruz.app.products.models.entity.Product;
import com.nicolasbncruz.app.products.models.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/listar")
    public List<Product> listar(){
        return productService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Product detalle(@PathVariable Long id) {
        return productService.findById(id);
    }

}
