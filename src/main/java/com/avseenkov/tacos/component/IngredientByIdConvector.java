package com.avseenkov.tacos.component;

import com.avseenkov.tacos.model.Ingredient;
import com.avseenkov.tacos.repository.IngredientRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class IngredientByIdConvector implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
