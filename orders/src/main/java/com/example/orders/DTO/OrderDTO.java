package com.example.orders.DTO;

import com.example.orders.Entities.Customer;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class OrderDTO {
    Long id;
    Customer customer;
    Integer quantity;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
enum OrderStatus {
    DELIVERED,
    CREATED,
    CANCELED
}