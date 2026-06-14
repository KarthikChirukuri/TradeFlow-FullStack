package com.stock.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.demo.dto.OrderDTO;
import com.stock.demo.entity.Orders;
import com.stock.demo.exceptionhandling.InvalidOrderException;
import com.stock.demo.repository.OrdersRepository;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public String storeOrder(OrderDTO dto) {

        if(dto.getQty() <= 0) {
            throw new InvalidOrderException(
                    "Quantity must be greater than 0");
        }

        if(dto.getPrice() <= 0) {
            throw new InvalidOrderException(
                    "Price must be greater than 0");
        }

        if(dto.getName() == null || dto.getName().trim().isEmpty()) {
            throw new InvalidOrderException(
                    "Stock name cannot be empty");
        }

        Orders o = new Orders();

        o.setName(dto.getName());
        o.setPrice(dto.getPrice());
        o.setQty(dto.getQty());
        o.setMode(dto.getMode());

        ordersRepository.save(o);

        return "Order Stored!";
    }
}