package me.rajarya.otel.service;

import me.rajarya.otel.core.model.Product;
import me.rajarya.otel.exceptions.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {

    private static final Map<String, Product> productMap = Map.of(
            "1", new Product("1", "Product 1", "Product 1 description", null),
            "2", new Product("2", "Product 2", "Product 2 description", null),
            "3", new Product("3", "Product 3", "Product 3 description", null),
            "4", new Product("4", "Product 4", "Product 4 description", null),
            "5", new Product("5", "Product 5", "Product 5 description", null)
    );

    public Product getProduct(String productId) {
        if (productMap.containsKey(productId)) {
            return productMap.get(productId);
        } else {
            throw new ProductNotFoundException(productId);
        }
    }
}
