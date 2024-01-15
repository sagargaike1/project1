package com.sagar.ServiceImpl;

import com.sagar.DAO.ProductRepository;
import com.sagar.Model.Product;
import com.sagar.Model.User;
import com.sagar.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsBySeller(Long sellerId) {
        User seller = new User();
        seller.setId(sellerId);
        return productRepository.findBySeller(seller);
    }
}

