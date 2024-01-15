package com.sagar.Service;

import com.sagar.Model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getOrdersByBuyer(Long buyerId);
}
