package me.rajarya.otel.service;

import io.micrometer.core.annotation.Timed;
import me.rajarya.otel.core.model.Price;
import me.rajarya.otel.exceptions.PriceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Timed
public class PriceService {
    private static final Map<String, Price> priceMap = Map.of(
            "1", new Price("USD", 100.0, 5.0),
            "2", new Price("USD", 90.0, 2.0),
            "3", new Price("USD", 120.0, 10.0),
            "4", new Price("USD", 50.0, 5.0)
    );

    @Timed(value = "getPrice", description = "Time taken to return price")
    public Price getPrice(String productId) {
        if (priceMap.containsKey(productId)) {
            return priceMap.get(productId);
        } else {
            throw new PriceNotFoundException(productId);
        }
    }
}
