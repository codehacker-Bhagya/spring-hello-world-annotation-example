package com.bhagya.practice.model;

import lombok.*;
import org.springframework.beans.BeanMetadataAttribute;

@Builder
@Data
@Setter
@Getter
public class Address {

    private City city;

    public static Object builder() {
        return null;
    }

    public BeanMetadataAttribute getCity() {
        return null;
    }
}
