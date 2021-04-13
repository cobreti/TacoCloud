package com.example.tacocloud.tacos;

import lombok.Data;

@Data
public class Ingredient {
    public final String id;
    public final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
