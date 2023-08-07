package me.rajarya.otel.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import me.rajarya.otel.core.model.Price;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Slf4j
public class PriceClient {

    @Value("${price.service.url:http://localhost:8081}")
    private String priceServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public Price getPrice(String productId) {
        try {
            return restTemplate.getForObject(priceServiceUrl + "/api/price/" + productId, Price.class);
        } catch (Exception e) {
            log.error("Error while fetching price for product id: {}", productId, e);
            return new Price("USD", getRandomValue(10.0, 100.0), getRandomValue(0.0, 10.0));
        }
    }

    public double getRandomValue(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
