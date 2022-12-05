/*
 * Author Name : Jaswanth Sai
 * Date : 11/22/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.jap.shopping.service;

import com.jap.shopping.domain.Product;
import com.jap.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public String deleteById(int id) {
        this.productRepository.deleteById(id);
        return "Deleted the Product";
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return this.productRepository.findById(id);
    }
}
