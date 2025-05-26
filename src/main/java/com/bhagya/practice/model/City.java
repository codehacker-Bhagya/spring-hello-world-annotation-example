package com.bhagya.practice.model;

import lombok.*;

@Builder
@Data
public class City {

    private String name;

    public static <E extends Enum<E>> Enum<E> builder() {
        return null;
    }


    public void setName(String pune) {
    }
}
