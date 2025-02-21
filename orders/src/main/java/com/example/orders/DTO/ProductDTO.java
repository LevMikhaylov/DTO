package com.example.orders.DTO;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class ProductDTO {
    Long id;
    String name;
    Double price;
    Integer quantity;

    @Enumerated(EnumType.STRING)
    String status;
}
enum Status {
    DELIVERED,
    CREATED,
    CANCELED
}