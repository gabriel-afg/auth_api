package com.example.auth.services;

import com.example.auth.domain.product.Product;
import com.example.auth.domain.product.ProductRequestDTO;
import com.example.auth.domain.product.ProductResponseDTO;
import com.example.auth.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product createProduct(ProductRequestDTO dados){
        Product newProduct = new Product(dados);
        this.repository.save(newProduct);

        return newProduct;
    }

    public List<ProductResponseDTO> listProducts(){
        return this.repository.findAll().stream().map(ProductResponseDTO::new).toList();
    }
}
