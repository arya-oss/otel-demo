package me.rajarya.otel.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Price {

    private String currency;
    private Double value;
    private Double discount;
}
