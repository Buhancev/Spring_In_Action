package com.bbuhha.taco_cloud.model;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
