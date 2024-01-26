package org.deomugabe.productservice.dto;

import lombok.Data;
import org.deomugabe.productservice.model.Product;

@Data
public class ProductResponse {
    private String name;
    private String description;
    private int price;

    public static ProductResponse from(Product product){
        ProductResponse productResponse = new ProductResponse();
        productResponse.name=product.getName();
        productResponse.description=product.getDescription();
        productResponse.price=product.getPrice();

        return productResponse;
    }
}

