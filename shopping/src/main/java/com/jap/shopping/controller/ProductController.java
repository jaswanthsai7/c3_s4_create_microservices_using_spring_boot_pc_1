/*
 * Author Name : Jaswanth Sai
 * Date : 11/22/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.jap.shopping.controller;

import com.jap.shopping.domain.Product;
import com.jap.shopping.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

   private IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getallproducts")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(this.productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<?> getByProductId(@PathVariable int id) {
        return new ResponseEntity<>(this.productService.getProductById(id), HttpStatus.OK);
    }

    @PostMapping("/savetheproduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        return new ResponseEntity<>(this.productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable int id) {
        return new ResponseEntity<>(this.productService.deleteById(id), HttpStatus.OK);
    }
}
