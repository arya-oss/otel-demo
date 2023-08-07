package me.rajarya.otel.controller;

import io.micrometer.core.annotation.Timed;
import me.rajarya.otel.client.PriceClient;
import me.rajarya.otel.core.model.Product;
import me.rajarya.otel.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@Timed
public class ProductController {

    private ProductService productService;
    private PriceClient priceClient;

    @Autowired
    public ProductController(ProductService productService, PriceClient priceClient) {
        this.productService = productService;
        this.priceClient = priceClient;
    }

    @GetMapping("/{id}")
    @Timed(value = "product.get", histogram = true, percentiles = {0.95, 0.99})
    public Product getProduct(@PathVariable("id") String productId) {
        Product product = productService.getProduct(productId);
        product.setPrice(priceClient.getPrice(productId));
        return product;
    }
}
