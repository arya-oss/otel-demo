package me.rajarya.otel.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String id;
    private String name;
    private String description;
    private Price price;
}
