package com.example.recipesApp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    enum Category {
        FRUIT, VEGETABLE, PROTEIN, SUBSTANCE, LIQUID
    }
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToMany(mappedBy = "ingredients")
    private Set<Recipe> recipes;
}
