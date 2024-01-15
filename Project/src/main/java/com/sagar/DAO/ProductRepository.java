package com.sagar.DAO;

import com.sagar.Model.Product;
import com.sagar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findBySeller(User seller);
}
