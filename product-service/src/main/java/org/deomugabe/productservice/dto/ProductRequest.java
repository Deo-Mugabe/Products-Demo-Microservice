package org.deomugabe.productservice.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
    private Long id;
    private String name;
    private String description;
    private int price;
}
