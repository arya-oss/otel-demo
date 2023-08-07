package me.rajarya.otel.controller;

import me.rajarya.otel.core.model.Price;
import me.rajarya.otel.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/price")
public class PriceController {

    private PriceService priceService;
    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/{id}")
    public Price getPrice(@PathVariable("id") String productId) {
        return priceService.getPrice(productId);
    }
}
