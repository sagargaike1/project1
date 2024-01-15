package com.sagar.Service;

import com.sagar.Model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
    List<Product> getProductsBySeller(Long sellerId);
}
