package com.sagar.ServiceImpl;

import com.sagar.DAO.OrderRepository;
import com.sagar.Model.Order;
import com.sagar.Model.User;
import com.sagar.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrdersByBuyer(Long buyerId) {
        User buyer = new User();
        buyer.setId(buyerId);
        return orderRepository.findByBuyer(buyer);
    }
}

