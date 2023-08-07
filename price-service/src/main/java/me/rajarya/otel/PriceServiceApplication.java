package me.rajarya.otel;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceServiceApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PriceServiceApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
