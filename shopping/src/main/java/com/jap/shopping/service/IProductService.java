package com.jap.shopping.service;

import com.jap.shopping.domain.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
   String deleteById(int id);

   Optional<Product> getProductById(int id);
}
